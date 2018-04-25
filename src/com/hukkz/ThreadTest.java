package com.hukkz;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadExample t1= new ThreadExample();
		ThreadExample2 t2 = new ThreadExample2();
		t1.start();
		t2.start();
	}
}
