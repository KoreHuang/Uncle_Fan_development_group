package text_thread;

public class Text2 {
	public static void main(String[] args) {
		MyThread th2=new MyThread("T");
		th2.start();
		for(int i=0;i<10;i++){
			System.out.println("main----------"+i);
		}
	}
}
