package BasicRecursion;
import java.util.*;
public class PrintNto1 {
    public void printer(int n)
    {
        if(n>1)
        {
            System.out.println(n);
            printer(n-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter Number:");
        n=sc.nextInt();
        PrintNto1 ob=new PrintNto1();
        ob.printer(n);
        sc.close();
    }
    
}
