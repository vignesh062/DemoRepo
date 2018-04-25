package com.hukkz;

public class ThreadExample2 extends Thread{

	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println("thread 2 "+i);
		}
	}
	
	
}
