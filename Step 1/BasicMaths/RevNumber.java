package BasicMaths;
import java.util.*;
public class RevNumber 
{
    public int reverse(int n)
    {
        int s=0,e;
        while(n>0)
        {
            e=n%10;
            s=s*10+e;
            n/=10;
        }
        return(s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RevNumber ob=new RevNumber();
        System.out.print("Enter Number:");
        int n=sc.nextInt();
        int s=ob.reverse(n);
        System.out.println("Reversed Number:"+s);
        sc.close();
    }
}