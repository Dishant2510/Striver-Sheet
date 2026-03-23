package BasicRecursion;
import java.util.*;
public class RevArray {
    public void reversal(int arr[],int n)
    {
        int p1=0;
        int p2=n-1;
        int t;
        while(p1<p2)
        {
            t=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=t;

            p1++;
            p2--;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        RevArray ob= new RevArray();
        System.out.println("Enter number of elements of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        ob.reversal(arr,n);
        System.out.println("Reversed array:\n");
        int i=0;
        while(i<n)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
        sc.close();
    }
}