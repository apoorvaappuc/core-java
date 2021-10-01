class IfElseIf{
public static void main(String[] args){
       int num=4569;
       if(num<9 && num>=0)
       {
        System.out.println("ONE...");
       }
       else if(num<99 && num>=10)
       {
        System.out.println("TWO...");
       }
       else if(num<999 && num>=100)
       {
        System.out.println("THREE...");
       }
       else if(num<9999 && num>=1000)
       {
        System.out.println("FOUR...");
       }
       else if(num<99999 && num>=10000)
       {
        System.out.println("FIVE...");
       }
       else
       {
        System.out.println("MORE THAN 5...");
       }
}
}