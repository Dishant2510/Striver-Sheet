
import java.util.*;
public class SelectionSort 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();

        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(ar[min]>ar[j])
                    min=j;
            }
            if(min!=i)
            {
                int t=ar[i];
                ar[i]=ar[min];
                ar[min]=t;
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+"  ");
        sc.close();
    }    
}
