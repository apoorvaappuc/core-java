package constructors.constructorchaining;

public class Moon {
	String color;
	String shape;
	int size;
	
	Moon()
	{
		this("Moon");
		System.out.println("This is default constructor");
	}
	
	Moon(String color)
	{
		this("white","round");
		System.out.println("This is single parameterized constructor");
		this.color=color;
	}
	
	Moon(String color,String shape)
	{
		this("white","round",500);
		System.out.println("This is two parameterized constructor");
		this.color=color;
		this.shape=shape;
	}
	
	Moon(String color,String shape, int size)
	{
		System.out.println("This is three parameterized constructor");
		this.color=color;
		this.shape=shape;
		this.size=size;
	}
	
	
	}
	
	
	


