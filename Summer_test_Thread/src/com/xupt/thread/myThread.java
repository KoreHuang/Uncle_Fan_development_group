package com.xupt.thread;

public class myThread extends Thread {
	public static int count;
	private static int i;
	private String Name;
	private static int flag = 1;
	private static byte[] lack = new byte[0];

	public myThread() {
		this("匿名线程");
	}

	public myThread(String threadName) {
		super(threadName);
		Name = threadName;
		flag = 1;
		count++;
	}

	private void P() {
		synchronized (lack) {
			--flag;
			System.out.println("flag after"+Thread.currentThread().getName()+" P():" + flag);
			if (flag < 0) {
				try {
					System.out.println(Thread.currentThread().getName()
							+ "执行wait()操作开始阻塞...");
					lack.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void V() {

		synchronized (lack) {
			++flag;
			System.out.println("flag after V():" + flag);
			if (flag <= 0) {
				System.out.println(Name + "执行notify()操作.........");
				lack.notify();
			}
		}
	}

	public void run() {
		// int i;
		// for(i=0;i<10;i++)
		// {
		P();
		System.out.println(Name + ":----p----");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.i = this.i + 1;
		System.out.println(Name + "进行中" + "--i:" + this.i);
		V();
		System.out.println(Name + ":----v----");
		// }
	}
}
