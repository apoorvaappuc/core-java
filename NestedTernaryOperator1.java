class NestedTernaryOperator1{
public static void main(String[] args){


      int n1=100;
      int n2=400;
      int n3=800;
    
      int num= n1>n2? (n1>n3?n1:n3):(n2>n3?n2:n3);
      System.out.println(num);


}
}