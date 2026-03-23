package BasicRecursion;
import java.util.*;
public class PrintTillN {
    public void printer(int n)
    {
        if(n>1)
            printer(n-1);

        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter Number:");
        n=sc.nextInt();
        PrintTillN ob=new PrintTillN();
        ob.printer(n);
        sc.close();
    }
    
}
