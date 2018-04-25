package com.hukkz.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {

	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		Student student1 = new Student(101, "vignesh", 20000);
		Student student2 = new Student(102, "surya", 40000);
		
		list.add(student2);
		list.add(student1);
		
		for (Object object : list) {
			Student student = (Student) object;
			System.out.println(student.getSid());
			System.out.println(student.getSname());
			System.out.println(student.getFee());
			System.out.println("--------------");
		}
		
	}
}
