package BasicMaths;
import java.util.*;
public class DigitCount 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int cn=(int)(Math.log10(n)+1);
        System.out.println("Number of digits="+cn);
        sc.close();
    }
}
