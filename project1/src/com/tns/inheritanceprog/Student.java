package com.tns.inheritanceprog;

public class Student extends Citizen {
	private int rollno;
	private String collegeName;
	public Student() {
		super();
	}
	public Student(int rollno,String collegeName) {
		super();
		this.rollno=rollno;
		this.collegeName=collegeName;
	}
	public Student(String name,long adharno,String address,long phno) {
		super(name,adharno,address,phno);
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	}

