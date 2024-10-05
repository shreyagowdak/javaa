import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num>=18)
            System.out.println("we are able to vote");
        else
            System.out.println("we are not able to vote");
        
    }
}

