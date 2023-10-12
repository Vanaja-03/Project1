package com.tns.exception;

public class WithException {
	public static void divide() {
		int a=7,b=0,c;
		try {//exception occurs
			c=a/b;
		}
		catch(ArithmeticException e) {//exception is handled
			System.out.println("Exception caught"+e.getMessage());
	}
		catch(ArrayIndexOutOfBoundsException e) {//exception is handled
			System.out.println("Exception caught"+e.getMessage());

}
		catch(Exception e) {//exception is handled
			System.out.println("Exception caught"+e.getMessage());
		}
		finally {
			System.out.println("this will be executed");
		}
		}
}
