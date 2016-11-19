package com.xupt.testSynchronizedThis;

public class RunThread extends Thread {
	ResharClass resharClass;
	public RunThread(ResharClass r,String name) {
		super(name);
		this.resharClass=r;
	}
	@Override
	public void run() {
		resharClass.exp();
	}
	public static void main(String[] args) {
		ResharClass r=new ResharClass();
		new RunThread(r, "A--").start();
		new RunThread(r, "B--").start();
		
	}
}
