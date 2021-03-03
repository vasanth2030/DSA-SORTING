package Sorting;

import java.util.Scanner;
import java.util.Scanner;
public class mergesort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int num=s.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<num;i++)
            arr[i]=s.nextInt();
        printarray(arr);
        System.out.println("Array after Merge sorting: ");
        mergesort1(arr,0,arr.length-1);
        printarray(arr);
    }
    static void mergesort1(int arr[],int l,int r)
    {
        if(r>l)
        {
            int m=l+(r-l)/2;
            mergesort1(arr,l,m);
            mergesort1(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }
    static void merge(int arr[], int l, int m, int r)
    {
        int n1= m-l+1;
        int n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++) {
            left[i] = arr[l+i];
        }
        for(int j=0;j<n2;j++) {
            right[j] = arr[m + 1 + j];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[k++]=left[i++];

            }
            else {
                arr[k++] = right[j++];
            }
        }
        while(i<n1)
        {
            arr[k++]=left[i++];
        }
        while(j<n2) {
            arr[k++] = right[j++];
        }

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
