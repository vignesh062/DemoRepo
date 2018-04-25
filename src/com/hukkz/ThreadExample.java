package com.hukkz;

public class ThreadExample extends Thread{

	@Override
	public void run() {
		
			for (int i = 1; i <=10; i++) {
				System.out.println("thread 1 "+i);
				
			}
	}
}
