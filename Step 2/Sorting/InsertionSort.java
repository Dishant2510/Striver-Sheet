import java.util.*;
public class InsertionSort {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            int key=ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>key)
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+"  ");
        sc.close();
    }
}
