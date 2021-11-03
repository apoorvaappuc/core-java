package com.java.Encapsulation;

public class JavaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile=new Mobile();
		mobile.setBrand("NOKIA");
		mobile.setPrice(15000);
		mobile.setRamSize(4);
		mobile.setCamera("4pxl");
		
		System.out.println("BRAND: "+mobile.getBrand());
		System.out.println("PRICE: "+mobile.getPrice());
		System.out.println("RAMSIZE: "+mobile.getRamSize());
		System.out.println("CAMERA: "+mobile.getCamera());
	
		 

	}

}
