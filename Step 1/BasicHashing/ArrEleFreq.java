package BasicHashing;
import java.util.*;
public class ArrEleFreq 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();

        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key=ar[i];
            int freq=0;
            if(mp.containsKey(key))
                freq=mp.get(key);
            freq++;
            mp.put(key,freq);
        }
        System.out.println("Enter number of queries");
        int q=sc.nextInt();
        while(q-->0)
        {
            System.out.println("Enter query");
            int num=sc.nextInt();
            if(mp.containsKey(num))
                System.out.println(mp.get(num));
            else
                System.out.println(0);
        }
        sc.close();
    }    
}