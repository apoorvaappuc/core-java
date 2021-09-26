class BitwiseOperatorsAssignment{
public static void main(String[]args){

        int a=60;
        int b=50;
        int c=20;
       
        System.out.println("Bitwise & operator....");  
        System.out.println(a<b & a<c);
        System.out.println(a<b & ++a<c);
        System.out.println(a);
        System.out.println(a>b & a<++c);
        System.out.println(a);

        System.out.println("Bitwise | operator....");  
        System.out.println(a>b | a<c);
        System.out.println(a>b | a++<c);
        System.out.println(a);
        System.out.println(a>b | a<++c);
        System.out.println(c);

}
}