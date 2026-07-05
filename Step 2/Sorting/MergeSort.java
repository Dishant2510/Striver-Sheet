import java.util.*;
public class MergeSort {
    void Sort(int ar[],int left,int right)
    {
        if(left<right)
        {
            int mid=(left+right)/2;
            Sort(ar,left,mid);
            Sort(ar,mid+1,right);
            Merge(ar,left,mid,right);
        }
    }
    void Merge(int ar[],int left,int mid, int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for (int i=0;i<n1;i++)
            L[i]=ar[left+i];
        for(int j=0;j<n2;j++)
            R[j]=ar[mid+1+j];
        int i=0,j=0,k=left;
        while(i<n1&&j<n2)
        {
            if(L[i]<=R[j])
            {
                ar[k]=L[i];
                i++;
            }
            else
            {
                ar[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {    
            ar[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            ar[k]=R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        MergeSort ob=new MergeSort();
        ob.Sort(ar, 0, n-1);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
            System.out.print(ar[i]+"  ");
        sc.close();
    }
}
