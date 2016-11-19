package text_thread;

public class MyThread3 extends Thread {
	Account account;
	public MyThread3(String name,Account account) {
	// TODO Auto-generated constructor stub
		super(name);
		this.account=account;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.SaveMoney();
	}
}
