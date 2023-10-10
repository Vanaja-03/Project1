package com.tns.staticprograms;
//program demonistrate static method and block
public class MyClass {
	private int section;//instance variable
	private static int srNo;//static variable
	
	//static block
	static {
		System.out.println("---------staticblock-------");
		srNo=1000;
	}
	//default constructor
	MyClass() {
		System.out.println("----------default constructor-------");
		srNo++;
		section++;
	}
	//static method
	static void display() {
		//system.out.println("section"+section);
		System.out.println("serialNo"+srNo);
	}
	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	
}
