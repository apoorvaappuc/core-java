package com.java;

public class MethodOverriding1 {

	public static void main(String[] args) {
		   
		RBI rbi=new RBI();
		HDFC hdfc=new HDFC();
		SBI sbi=new SBI();
		
		rbi.interestRate();
		hdfc.interestRate();
		sbi.interestRate();
	}

}
