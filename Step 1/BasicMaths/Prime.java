package BasicMaths;
import java.util.*;

public class Prime {

boolean isPrime(int n) {
    if (n <= 1) return false;

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}   
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number:");
        n=sc.nextInt();
        Prime ob=new Prime();
        if(ob.isPrime(n))
            System.out.println("Prime Number");
        else 
            System.out.println("Not a prime number");
        sc.close();
    }
    
}
