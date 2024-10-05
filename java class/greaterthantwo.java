
import java.util.Scanner;

class greaterthantwo 
{
 public static void main(String[] args) 
 {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value of n");   
    System.out.println("enter the value of m");
    int n=sc.nextInt();
    int m=sc.nextInt();
    if(n>m)
       System.out.println("n is greater");
    else    
       System.out.println("m is greater");
 }
}
