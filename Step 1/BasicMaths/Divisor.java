package BasicMaths;
import java.util.*;
public class Divisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number:");
        n=sc.nextInt();
        System.err.println("Divisors are");
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                System.err.print(i+" ");
        }
        System.err.print(n);
        sc.close();
    }
}
