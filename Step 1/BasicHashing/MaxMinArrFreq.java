package BasicHashing;
import java.util.*;
public class MaxMinArrFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter elements of array");
        for(i=0;i<n;i++)
            ar[i]=sc.nextInt();
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(i=0;i<n;i++)
        {
            int key=ar[i];
            int freq=0;
            if(hp.containsKey(key))
                freq=hp.get(key);
            freq++;
            hp.put(key,freq);
        }
        //for (int i = 0; i < n; i++) {
        //   map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
       // }
        int maxFre=0,maxEle=0,minFre=n,minEle=0;
        for(HashMap.Entry<Integer,Integer> entry:hp.entrySet())
        {
            int ele=entry.getKey();
            int fre=entry.getValue();
            if(maxFre<fre)
            {
                maxEle=ele;
                maxFre=fre;
            }
            if(minFre>fre)
            {
                minFre=fre;
                minEle=ele;
            }
        }
        System.out.println("Max Freq element:"+maxEle+"\nMin Freq ELement:"+minEle);
        sc.close();
    }
}
