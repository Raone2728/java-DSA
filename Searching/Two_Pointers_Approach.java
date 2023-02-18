//problem=Find if there is a pair with x sum present in the array or Not\
//1.Input=[2,5,8,12,30] x=17
//output=true

import java.util.*;
public class Two_Pointers_Approach {
    static boolean pairSum(int arr[],int x){

        int low=0;
        int high=arr.length-1;

        while(low<=high){

            if(arr[low]+arr[high]==x){
                return true;
            }
            else if(arr[low]+arr[high]<x){
                low++;
            }
            else{
                high--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[]={3,8,13,18};
        int x=14;
        System.out.println(pairSum(arr,x));
    }
}
