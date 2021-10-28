package com.java.TypeCasting;

public class DownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Vehicle vehicle= new Bike();
		    //vehicle.name="BMW";
		        
              Bike bike=(Bike)vehicle;
              bike.price=8000;
            
              System.out.println("type:"+vehicle.type);
              System.out.println("price:"+bike.price);
              }

}
