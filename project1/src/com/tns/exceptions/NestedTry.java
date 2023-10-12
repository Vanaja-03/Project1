package com.tns.exceptions;

public class NestedTry {
	public static void check() {
	String str="tns";
	int slength=str.length();
	System.out.println("the length is"+slength);
	String anotherString="null";
	int s1=anotherString.length();
	System.out.println("the length is"+s1);
	int y=6;
	try {//outer try
			int z=y/0; //exception occurs
		try {//inner try
			System.out.println(str.charAt(y));//exception arises
		}
		catch(StringIndexOutOfBoundsException ex) {//inner catch
			System.out.println("IndexOutOfBounds"+ex.getMessage());
		}
		catch(NullPointerException ex) {
			System.out.println("NullPointer Exception"+ex.getMessage());
		}
	}
		catch(ArithmeticException ex) {//inner catch
			System.out.println("Arithmetic Exception"+ex.getMessage());
		}
	}

}
