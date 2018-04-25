package com.hukkz.collections;

public class Student {

	private int sid;
	private String sname;
	private float fee;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, float fee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fee = fee;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	
		
		
	}

