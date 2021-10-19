package com.java;

public class MethodOverloading {
	
	void sum(int a, int b)
	{
		System.out.println("a+b: "+(a+b));
	}
	
	void sum(int x, int y,int z)
	{
		System.out.println("x+y+z: "+(x+y+z));
	}
	 
	void sum(float m, float n)
	{
		System.out.println("m+n: "+(m+n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MethodOverloading mod=new MethodOverloading();
      
      mod.sum(1,3);
      mod.sum(1,2,3);
      mod.sum(1.1f,2.2f);
	}

	
		
	}

	

	

	

	

