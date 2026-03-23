package BasicRecursion;

import java.util.Scanner;

public class SumTillN {
    public int sum(int n)
    {
        if(n>1)
            return n + sum(n-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter Number:");
        n=sc.nextInt();
        SumTillN ob=new SumTillN();
        int s=ob.sum(n);
        System.out.println("SUM="+s);
        sc.close();
    }
    
}
