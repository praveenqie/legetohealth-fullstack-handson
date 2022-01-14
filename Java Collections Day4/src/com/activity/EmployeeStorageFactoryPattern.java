package com.activity;

public class EmployeeStorageFactoryPattern {

	public EmployeeStorage getEmployeeImpl(int value) {
		if (value == 1) {
			System.out.println("------------ArrayList impl implementaion called----------");
			return new EmployeeStorageArrayListImpl();
		} else if (value == 2) {
			System.out.println("------------Hashset impl implementaion called----------");
			return new EmployeeStorageHashsetImpl();
		}else if(value ==3) {
			System.out.println("------------Treeset impl implementaion called----------");
			return new EmployeeStorageTreeSetImpl();
		}
		return null;

	}

}
