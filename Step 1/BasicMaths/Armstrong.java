package BasicMaths;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int d,sn,e,sum=0;
        d=(int)(Math.log10(n)+1);
        sn=n;
        while(sn!=0)
        {
            e=sn%10;
            sum=sum+(int)(Math.pow(e,d));
            sn/=10;
        }
        if(sum==n)
            System.out.print("Armstrong Number");
        else
            System.out.print("Not an Armstrong Number");
        sc.close();
    }
}