import java.util.*;

class mulTable {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num=sc.nextInt();
       System.out.println("Multiplication table of " +num+ " is \n");
       for(int i=0;i<=10;i++)
       {
           int mul=num*i;
           System.out.println(mul);
       }
    }
}