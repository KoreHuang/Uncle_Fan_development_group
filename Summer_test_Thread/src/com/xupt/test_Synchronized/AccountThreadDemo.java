package com.xupt.test_Synchronized;

public class AccountThreadDemo {
	public static void main(String[] args) {
		Account account=new Account(100);
		Thread customerA=new Thread(account,"A");
		Thread customerB=new Thread(account,"B");
		customerA.start();
		customerB.start();
	}
}
