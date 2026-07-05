import java.util.*;
public class BubbleSort {
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
            int flag=0;
            for(int j=0;j<n-1-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    flag=1;
                    int t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
            }
            if(flag==0)
                break;
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+"  ");
        sc.close();
    }
}
