class SingleInheritence{
public static void main(String[] args){

Fruit fruit=new Fruit();
Apple apple=new Apple();


fruit.name="PINEAPPLE";
fruit.color="YELLOW";
fruit.taste="SWEET";


apple.name="APPLE";
apple.color="RED";
apple.taste="SWEET";

System.out.println("apple.name:"+apple.name);
System.out.println("fruit.name:"+fruit.name);
}
}