package com.hukkz.collections;

public class BankAccount {
	private int accid;
	private String accname;
	private float accbal;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accid, String accname, float accbal) {
		super();
		this.accid = accid;
		this.accname = accname;
		this.accbal = accbal;
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public float getAccbal() {
		return accbal;
	}
	public void setAccbal(float accbal) {
		this.accbal = accbal;
	}
	
}
