package constructors.constructorchaining;

public class NewEmployee extends OldEmployee {
	int salary=5000;
	NewEmployee(int salOld,int salNew ){
		
		super(salOld);
		salary=salNew;
		
	}
	void display() {
		System.out.println(salary+" "+super.salary);
	}

	public static void main(String[] args) {
		NewEmployee emp=new NewEmployee(10000,9000);
		emp.display();
	}
}
