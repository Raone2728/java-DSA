
import java.util.*;
public class Count_Occurence_IN_Sorted_Array {


    static int fIndex(int arr[],int x){

        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }

        }


        return -1;
    }
    static int lastIndex(int arr[],int x){

        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                if(mid==arr.length-1 || arr[mid+1]!=arr[mid]){
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }

        }


        return -1;
    }

    static int  countOcc(int arr[],int x) {
     int  lIndex=lastIndex(arr,x );
     int   fIndex=fIndex(arr,x);
        int result=(lIndex-fIndex)+1;
         if(fIndex==-1){
         return 0;
     }
     return result;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 40, 40};

        int x = 20;

        System.out.println(countOcc(arr,x));
    }
}
