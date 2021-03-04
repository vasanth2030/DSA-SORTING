package Sorting;
import java.util.Scanner;
public class hoarespartition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int num=s.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<num;i++)
            arr[i]=s.nextInt();
        printarray(arr);
        System.out.println("Array after Hoares partition: ");
        hoares(arr,0,arr.length-1);
    }
    static void hoares(int arr[],int l, int r)
    {
        int i=l-1;
        int j=r+1;
        int pivot=arr[l];
        while(true)
        {
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j) {
                printarray(arr);
                break;
            }
            swap(arr,i,j);
        }

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
