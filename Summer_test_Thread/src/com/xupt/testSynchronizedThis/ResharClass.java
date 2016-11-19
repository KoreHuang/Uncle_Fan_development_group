package com.xupt.testSynchronizedThis;

public class ResharClass {
	public static final byte [] lock=new byte[0];
	public void exp(){
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"获得执行权限");
		}
		int count =10;
		synchronized (lock){
			while (count > 0) {
				
				System.out.println(Thread.currentThread().getName()+"Synchronized代码块中的输出");
				count --;
				
			}
		}
	}
}
