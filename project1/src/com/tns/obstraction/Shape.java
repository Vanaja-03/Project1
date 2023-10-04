package com.tns.obstraction;
//program to demonistrate obstraction in java
//Abstraction class
public class Shape {
	protected float area;
	//Abstract method
	obstract void calArea();
	void show() {//concrete method
		System.out.println("area of Shape is"+area);
	}

}
