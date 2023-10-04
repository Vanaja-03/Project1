package com.tns.abstraction;

public abstract class shape {
	protected float area;
	//Abstract method
	abstract void calArea();
	void show() {//concrete method
		System.out.println("area of shape is"+area);
	}
}
