package com.tnsif.override;

public class Sbi extends Rbi {
	public float getRateOfInterest() {
		System.out.println(super.getRateOfInterest());
		return 6.7f;
	}
	

}
