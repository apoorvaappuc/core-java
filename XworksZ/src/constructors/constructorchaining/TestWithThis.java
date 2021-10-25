package constructors.constructorchaining;

public class TestWithThis {
	TestWithThis()
	{
		this(10);
	 System.out.println("No arguement constructor");	
	}
	
	TestWithThis(int i)
	{
		this(10,20);
		System.out.println("one arguement constructor");	
	}
	
	TestWithThis(int i,int j)
	{
		System.out.println("two arguement constructor");	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestWithThis t1= new TestWithThis();
		TestWithThis t2= new TestWithThis();
		TestWithThis t3= new TestWithThis();
        
	}

}
