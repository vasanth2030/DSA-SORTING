package Sorting;

import java.util.Scanner;

public class lomutopartition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int num=s.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<num;i++)
            arr[i]=s.nextInt();
        printarray(arr);
        System.out.println("Array after Lomuto partition: ");
        lomuto(arr,0,arr.length-1);

    }
    static void lomuto(int arr[],int l, int r)
    {
        int key=arr[r];
        int i=l-1;
        for(int j=0;j<r;j++) {
            if (arr[j] < key) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        int temp=arr[r];
        arr[r]=arr[i+1];
        arr[i+1]=temp;
        printarray(arr);

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
