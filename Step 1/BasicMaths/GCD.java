package BasicMaths;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int n1=sc.nextInt();
        System.out.println("Enter number 2:");
        int n2=sc.nextInt();
        int gcd=1;
        while(n1!=0&&n2!=0)
        {
            if(n1>n2)
            {
                n1=n1-n2;
            }
            else if(n2>n1)
            {
                n2=n2-n1;
            }
            else
            {
                gcd=n1;
                break;
            }
        }
        if(n1==0)
            gcd=n2;
        else
            gcd=n1;
        System.out.println("GCD is : "+gcd);
        sc.close();
    }
    
}
