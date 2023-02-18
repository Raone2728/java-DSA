
import java.util.*;
public class Triplet_in_a_Sorted_Array {
    static void pairSum(int arr[],int x,int curr){

        int low=0;
        low++;
        int high=arr.length-1;

        while(low<=high){

            if(arr[low]+arr[high]+curr==x){
              System.out.println("True");
              System.exit(0);
            }
            else if(arr[low]+arr[high]+curr<x){
                low++;
            }
            else{
                high--;
            }
        }

    }
     static void triplet(int arr[],int x){

        int curr=0;
        int n= arr.length;
        while(curr<n){
            curr=arr[curr];
            pairSum(arr, x,curr);
            curr++;

        }
        System.out.println("False");
     }

    public static void main(String[] args) {
        int arr[]={1,2,5,6};
        int x=32;
       triplet(arr,x);
    }
}
