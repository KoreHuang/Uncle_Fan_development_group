package text_thread;

public class MyThread extends Thread {
	public MyThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		try {
			System.out.println("Thread start.....");
			
		Thread.sleep(2000);
			for(int i=0;i<10;i++){
				System.out.println(this.getName()+"----"+i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
