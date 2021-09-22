class Refrigerator{
     String name;
     int cost;
     String color;
     int temp;

void keepTheFoodCold(){
 System.out.println("If temperature is " +temp+ "food that is properly handled and stored..");
}

void speedChilling(){
 System.out.println(name +"refrigerator is good for speed chilling");

}

public static void main(String[] args){

     Refrigerator refrigerator=new Refrigerator();
     refrigerator.name="SAMSUNG";
     refrigerator.temp=5;
     refrigerator.color="RED";

     refrigerator.keepTheFoodCold();
     refrigerator.speedChilling();

}
}