package com.xupt.test_Synchronized;



public class Account implements Runnable{
	private  int count;
	private int i=5;
	public Account(int count){
		this.count = count;
	}
	@Override
	public synchronized void run() {
		int count=5;
		while(count>0){
			System.out.println(count+"--"+Thread.currentThread().getName()+"顾客来领钱，剩余:");
			take();
			try {
			
				Thread.sleep(500);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"顾客来存钱，剩余:");
			save();
			count--;
		}
	}
	private synchronized void take(){
		count-=10;
		showInfo();
	}
	private  synchronized void showInfo(){
		while(i>0){
			System.out.println(i+"--count:"+count+"...");
			i--;
		}
		i+=5;
	}
	private synchronized void save(){
		count+=10;
		showInfo();
	}
}
