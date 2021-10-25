package constructors.constructorchaining;

public class Student {
	
	int id;
	String name;

	
	Student(int id,String name )
	{
		this.id=id;
		this.name=name;
	}
	
	void display() {
		System.out.println(id + " " + name );
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(11,"ram");
		Student s2=new Student(12,"sham");
		s1.display();
		s2.display();
         
          
	}

}
