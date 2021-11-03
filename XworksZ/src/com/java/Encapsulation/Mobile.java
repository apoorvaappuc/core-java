package com.java.Encapsulation;

public class Mobile {
	private String brand;
	private double price;
	private int ramSize;
	private String camera;
	
	public Mobile() {
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) 
	{
		if(brand==null) {
			return;
		}
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	

}
