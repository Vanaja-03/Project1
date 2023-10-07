package com.tns.markerinterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a=new Student(1,"vanu");
		if(a instanceof Registarable)
		{
			System.out.println("student registered");
			
		}
		else
		{
			System.out.println("student not registered");
		}
			
		

	}

}
