package BasicRecursion;
import java.util.*;
public class PrintN {
    public void printer(int n)
    {
        if(n>1)
            printer(n-1);

        System.out.println("printing..");
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number:");
        n=sc.nextInt();
        PrintN ob=new PrintN();
        ob.printer(n);
        sc.close();
    }
}