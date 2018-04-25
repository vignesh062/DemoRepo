package com.hukkz.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BankAccountArrayList {

	public static void main(String[] args) {
		
		Set list = new HashSet();
		
		BankAccount account1= new BankAccount(255, "vignesh", 30000);
		BankAccount account2= new BankAccount(256, "surya", 22000);
		BankAccount account3= new BankAccount(256, "hello", 22000);
		
		list.add(account1);
		list.add(account2);
		list.add(account3);
		
		for (Object object : list) {
			BankAccount bankaccount = (BankAccount) object;
			System.out.println(bankaccount.getAccid());
			System.out.println(bankaccount.getAccname());
			System.out.println(bankaccount.getAccbal());
			System.out.println("-----------------------");
			
		}
	}
}
