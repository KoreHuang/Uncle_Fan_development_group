package text_thread;


public class Text3 extends Thread {
	public static void main(String[] args) {
		Account ccount=new Account();
		System.out.println("欢迎来到中国银行...........");
		Nythread2 th1= new Nythread2("陈象",ccount);
		Nythread2 th2= new Nythread2("小雨",ccount);
		Nythread2 th3= new Nythread2("柱子",ccount);
		Nythread2 th4= new Nythread2("焦洋",ccount);
		Nythread2 th5= new Nythread2("黄柯",ccount);
		th1.start();
		th4.start();
		th5.start();
		for (int i = 0; i < 30; i++) {
			(new MyThread3("王老师",ccount)).start();
		}
		th2.start();
		th3.start();
		
	}
}
