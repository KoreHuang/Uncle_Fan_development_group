package text_thread;

public class text {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThread th1=new MyThread(i+"");
			th1.setName("my"+i);
			th1.start();
		}
	}
}
