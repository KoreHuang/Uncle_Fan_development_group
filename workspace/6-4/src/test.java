
public class test {
	public static void main(String[] args) {
		dog d1=new dog("小黄");
		dog d2=new dog("小黑");
		d1.setName("小小黄");
		d2.setName("黄小小");
		user u1=new user();
		user u2=new user();
		u1.setName("李刚");
		u2.setName("王华");
		u1.cdog(d1);
		u2.cdog(d2);
		u1.showInfo();
		u2.showInfo();
	}
	
}
