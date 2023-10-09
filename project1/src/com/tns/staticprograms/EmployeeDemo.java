package com.tns.staticprograms;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee ob=new Employee("vannu",123);
        System.out.println(ob);
        Employee companyName;//accessing the static variable using class name
        ob=new Employee("shannu",345);
        System.out.println(ob);
	}

}
