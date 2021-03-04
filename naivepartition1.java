package Sorting;

import java.util.Scanner;

public class naivepartition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int num=s.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<num;i++)
            arr[i]=s.nextInt();
        printarray(arr);
        System.out.println("Array after Naive partition: ");
        naive(arr,0,arr.length-1,6);
    }
    static void naive(int arr[],int l,int r,int key)
    {
        int pivot=arr[key];
        int index=0;
        int temp[]=new int[r-l+1];
        for(int i=0;i<=r;i++)
        {
            if(arr[i]<=pivot) {
                temp[index] = arr[i];
                index++;
            }
        }
        for(int i=0;i<=r;i++)
        {
            if(arr[i]>pivot)
            {
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<=r;i++)
        {
            arr[i]=temp[i];
        }
        printarray(arr);
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
