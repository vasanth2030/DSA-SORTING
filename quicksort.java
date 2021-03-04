package Sorting;
import java.util.Scanner;
public class quicksort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int num=s.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<num;i++)
            arr[i]=s.nextInt();
        printarray(arr);
        System.out.println("Array after Quick Sort: ");
        qsort(arr,0,arr.length-1);
        printarray(arr);
    }
    static void qsort(int arr[],int l,int r)
    {
        if(l<r) {
            int p = partition(arr, l, r);
            qsort(arr, l, p - 1);
            qsort(arr, p + 1, r);
        }
    }
    static int partition(int arr[],int l, int r)
    {
        int i=l-1;
        int pivot=arr[r];
        for(int j=l;j<r;j++)
        {
            if(arr[j]<pivot) {
                i++;
                swap(arr,j,i);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printarray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
