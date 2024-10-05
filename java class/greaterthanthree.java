import java.util.Scanner;

public class greaterthanthree
{
 public static void main(String[] args) 
 {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value of n");   
    System.out.println("enter the value of m");
    System.out.println("enter the value of p");
    int n=sc.nextInt();
    int m=sc.nextInt();
    int p=sc.nextInt();
    if(n>m&& n>p)
       System.out.println("n is greater");
    else if (m>p&&m>n)  
       System.out.println("m is greater");
    else
       System.out.println("p is greater");
 }
}
