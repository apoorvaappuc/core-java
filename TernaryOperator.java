class TernaryOperator{
public static void main(String[] args){

        int x=100;
        int y=200;

        int result1= (x > y ? x : y);
        System.out.println("Largest of" + x + "&" + y +"is:"+result1);

        int result2= (x<y?x:y);
        System.out.print("Smallest of" + x + "&" + y +"is:"+result2);
}
}
  