import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.ls.LSInput;

public class User {
	private int  id;
	private String name;
	private String sex;
	public User(int id,String name,String sex) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.sex=sex;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ID:-"+id+"-Name:"+name+"Sex:"+sex+"]";
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	//*********************************************
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof User){
			User tmp=(User) obj;
				if(tmp.name.equals(this.name))
					return true;
		}
		return false;
	}
	public int getId() {
		return id;
	}
	public void Modify(int id,String name,String sex) {
		this.id=id;
		this.name=name;
		this.sex=sex;
	}
	
	public static void main(String[] args) {
		UserTools utl=new UserTools("/Users/mac/Desktop/demo/x.data");
		Scanner canner=new Scanner(System.in);
		String msg="";
		List<User> lst=new ArrayList<>();
		while (canner.hasNext()) {
		msg=canner.next();
		String []s=msg.split(",");
		lst.add(new User(Integer.parseInt(s[0]),s[1],s[2]));
		}
		utl.saveInfo(lst);
		lst=utl.getList();
		utl.throwList(lst);
		
	}
}
