package BasicRecursion;

import java.util.Scanner;

public class Facto {
    public int fact(int n)
    {
        if(n>1)
            return n * fact(n-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter Number:");
        n=sc.nextInt();
        Facto ob=new Facto();
        int f=ob.fact(n);
        System.out.println("Factorial="+f);
        sc.close();
    }
    
}
