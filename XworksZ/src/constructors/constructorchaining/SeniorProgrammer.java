package constructors.constructorchaining;

public class SeniorProgrammer extends JuniorProgrammer{
	
	     int salary=5000;
	     void display() {
	    	 System.out.println("Junior Programmer salary: "+super.salary);
	    	 System.out.println("Senior Programmer salary: "+salary);
	     }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeniorProgrammer senior=new SeniorProgrammer ();
		senior.display();
	}

}
