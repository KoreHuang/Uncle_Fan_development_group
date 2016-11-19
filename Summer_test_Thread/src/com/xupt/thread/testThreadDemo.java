package com.xupt.thread;

public class testThreadDemo {
	public static void main(String[] args) {
		myThread t1=new myThread("老大");
		myThread t2=new myThread("老二");
		myThread t3=new myThread("老三");
		
		t1.start();
		t2.start();
		t3.start();
		/*
		while(t1.isAlive()||t2.isAlive()||t3.isAlive());
		
		t1.stop();
		t2.stop();
		t3.stop();
		*/
			
	}

}
