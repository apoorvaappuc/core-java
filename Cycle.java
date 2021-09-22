class Cycle{
     int speed;
     int cost;
     String color;
     int gear;
     void speedUp(){
      System.out.println("If SPEED is :"+speed);
     }
      void changeGear(){
      System.out.println("GEAR will be :"+gear);
     }
  
public static void main(String[] args){
 Cycle cycle=new Cycle();
 cycle.speed=50;
 cycle.cost=9000;
 cycle.color="RED";
 cycle.gear=2;

 cycle.speedUp();
 cycle.changeGear();
}
}
 