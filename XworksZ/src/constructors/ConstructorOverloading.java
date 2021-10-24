package constructors;

public class ConstructorOverloading {

	public static void main(String[] args) {
		System.out.println("SINGLE PARAMETERIZED CONSTRUCTOR...");
		DollDemo jocker=new DollDemo("joker");
		System.out.println(jocker.name);
		System.out.println(jocker.price);
	}

}
