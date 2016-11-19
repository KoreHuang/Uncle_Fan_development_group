
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;
import java.util.List;

import org.w3c.dom.ls.LSInput;


public class UserTools {
	private final String path;
	public UserTools(String path) {
		// TODO Auto-generated constructor stub
		this.path=path;
	}
	public  boolean saveInfo(List<User> lst){
		boolean key=true;
		try {
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(lst);
			oos.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
			key=false;
		}
		return key;
	}
	public List<User> getList() {
		List<User> list=null;
		try(FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);){
			list=(List<User>)ois.readObject();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	public void throwList(List<User> lst) {
		for (User user : lst) {
			System.out.println(user);
		}
	}
	public Object getObj() {
		Object obj=null;
		try {
			FileInputStream fis=new FileInputStream(path);
			ObjectInputStream ois=new ObjectInputStream(fis);
			obj=ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return obj;
	}
	public void upDate(int id,String name,String sex) {
		List<User> lst =(List<User>)getObj();
		for (User user : lst) {
			if (user.getId()==id) {
				user.Modify(id,name,sex);
				break;
			}
		}
		saveInfo(lst);
	}
	public Object delObj(int id) {
		Object obj=null;
		List<User> lst =(List<User>)getObj();
		for (User user : lst) {
			if (user.getId()==id) {
				obj=user;
				lst.remove(user);
				break;
			}
		}
		saveInfo(lst);
		return obj;
	}
}
