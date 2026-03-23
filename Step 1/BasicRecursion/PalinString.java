package BasicRecursion;
import java.util.*;
public class PalinString 
{
    public boolean isPalin(String s,int i)
    {
        if(s.charAt(i)!=s.charAt(s.length()-1-i))
            return false;
        while(i<(s.length()/2))
            if(s.charAt(i)==s.charAt(s.length()-1-i))
                return isPalin(s, i+1);

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        PalinString ob=new PalinString();
        if(ob.isPalin(s,0))
            System.out.print("IS PALINDROME");
        else
            System.out.print("NOT PALINDROME");
        sc.close();
    }
}
