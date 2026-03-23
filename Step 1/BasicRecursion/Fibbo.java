package BasicRecursion;
import java.util.*;
public class Fibbo {
//public int fib(int N)
//{
//  
//        if (N <= 1) {
//          return N;
//    }
//        int last = fibonacci(N - 1);    // (N-1)th term
//      int slast = fibonacci(N - 2);   // (N-2)th term
//        return last + slast;
//    }rec func returns only the nth term
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        if (n == 0) {
            System.out.println("The Fibonacci Series up to " + n + "th term:");
            System.out.println(0);
        } else {
            int secondLast = 0; 
            int last = 1;       

            System.out.println("The Fibonacci Series up to " + n + "th term:");
            System.out.print(secondLast + " " + last + " ");

            int cur;
            for (int i = 2; i < n; i++) {
                cur = last + secondLast; 
                secondLast = last;       
                last = cur;
                System.out.print(cur + " ");
            }
        }
        sc.close();
    }
}
