package BasicRecursion;
import java.util.*;
public class PrintName {
   
    public void printer(int n)
    {
        if(n>1)
            printer(n-1);

        System.out.println("Dishant");
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number:");
        n=sc.nextInt();
        PrintName ob=new PrintName();
        ob.printer(n);
        sc.close();
    }
}