package com.tns.inheritanceprog;
class parent{// base class
	int var=100;
	
}

public class SuperDemo extends parent {// child class
	int var=50;
	void display() {
	System.out.println("the child value is"+var);
	System.out.println("the child value is"+super.var);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperDemo ob=new SuperDemo();
		ob.display();

	}

}
