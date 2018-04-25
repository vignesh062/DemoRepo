package com.hukkz.collections;

public class Employee  {

	private int eid;
	private String ename;
	private float salary;
	
	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, float salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}



/*	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (this.eid == e.eid) {
			return 0;
		}
		if (this.eid < e.eid) {
			return 1;
	}
		if(this.eid>e.eid)
		{
			return -1;
		}
		return 0;
	}
*/}

