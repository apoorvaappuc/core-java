class TernaryOperator1{
public static void main(String[] args){

      int x=50;
      int y=100;
      int z=150;

      int result1=(x > y) ? (x > z ? x : y) : (y > z ? y : z);
      System.out.println("Greatest of three number is:"+result1);

      int result2=(x < y) ? (x < z ? x : y) : (y < z ? y : z);
      System.out.println("Smallest of three number is:"+result2);
}
}