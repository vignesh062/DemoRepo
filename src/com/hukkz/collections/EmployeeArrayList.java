package com.hukkz.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeArrayList {

	public static void main(String[] args) {
		Set list = new TreeSet();
		
		Employee employee1 = new Employee(101, "vignesh", 20000);
		Employee employee2 = new Employee(102, "balaji", 20000);
		Employee employee3 = new Employee(103, "balaji", 20000);
	
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		for (Object object : list) {
			Employee employee = (Employee) object;
			System.out.println("eid: "+employee.getEid());
			System.out.println("ename: "+employee.getEname());
			System.out.println("sal: "+employee.getSalary());
			System.out.println("--------------------------");
		}
	}
}
