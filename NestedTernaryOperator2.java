class NestedTernaryOperator2{
public static void main(String[] args){


     int mark=70;
     char result;
     result = mark>80? 'A' : mark>=60 && mark<80 ? 'B' :'C';
     System.out.println(result);
}
}