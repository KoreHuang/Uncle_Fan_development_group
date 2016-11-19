
public class user {
	public dog d;
	public String userName;
	public void setName(String uName){
		userName=uName;
	}
	public void cdog(dog d1){
		d=d1;
	}
	public void showInfo(){
		System.out.println(userName+"的🐶叫:"+d.name);
	}
}
