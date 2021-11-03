package com.java.Encapsulation;

public class BeanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan=new Fan();
		//fan.setBrand("USHA");
		fan.setPrice(15000);
		fan.setColor("white");
		fan.setNoofblades(4);
		
		System.out.println("PRICE: "+fan.getPrice());
		System.out.println("Color: "+fan.getColor());
		System.out.println(fan.toString());
		
	

	}

}
