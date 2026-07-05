import java.util.*;
public class QuickSort 
{
    void Sort(int ar[],int low,int high)
    {
        if(low<high)
        {
            int pivot=partition(ar,low,high);
            Sort(ar,low,pivot-1);
            Sort(ar,pivot+1,high);
        }
    }
    int partition(int ar[],int low,int high)
    {
        int pivot=ar[low];
        int i=low+1;
        int j=high;
        while(true)
        {
            while(i<=high && ar[i]<=pivot)
                i++;

            while(ar[j]>pivot)
                j--;
            if(i>=j)
                break;

            int temp=ar[j];
            ar[j]=ar[i];
            ar[i]=temp;
        }
        int temp=ar[low];
        ar[low]=ar[j];
        ar[j]=temp;

        return j;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        QuickSort ob=new QuickSort();
        ob.Sort(ar, 0, n-1);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+"  ");
        sc.close();
    }
}
