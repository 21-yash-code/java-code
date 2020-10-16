import java.util.*;
public class ArraySort {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        if(n<1)
        System.out.println("Array size should be greater than 0");
        else
        {
            int[] arr=new int[n];
            int i,j,a,temp;
            System.out.println("Enter the elements:");
            for(i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            a=n/2;
            if(n%2!=0)
            a++;
            for(i=0;i<a;i++)
            {
                for(j=i;j<a;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            for(i=a;i<n;i++)
            {
                for(j=i;j<n;j++)
                {
                    if(arr[i]<arr[j])
                    {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            for(i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}