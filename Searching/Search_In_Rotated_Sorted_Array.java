import java.util.*;
public class Search_In_Rotated_Sorted_Array {

    static int search(int arr[],int n,int x){
        int low=0;
        int high=arr.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>arr[low]){
                if(arr[mid]>x){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<x){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 6, 5, 8}, n = 6;

        int x =5;

        System.out.println(search(arr, n, x));
    }
}