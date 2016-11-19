package text_thread;


public class consumThread extends Thread{
	BaoZiPu baoZiPu;
	public consumThread(String name,BaoZiPu baoZiPu) {
		// TODO Auto-generated constructor stub
		super(name);
		this.baoZiPu=baoZiPu;
	}
	@Override
	public void run() {
		baoZiPu.consum();
	}
}
