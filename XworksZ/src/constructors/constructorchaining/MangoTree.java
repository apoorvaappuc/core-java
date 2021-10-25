package constructors.constructorchaining;

public class MangoTree extends Tree {
	String name;
	String type;
	
	//MangoTree(){
		//super();
	//System.out.println("Mango tree default constructor");
		
	//}
	MangoTree(){
		this("mango","zera");
		System.out.println("Single parameter");
	}
	
	MangoTree(String name, String type){
		
		System.out.println("Mango tree parameterized constructor");
		this.name=name;
		this.type=type;
		
	}
	

}
