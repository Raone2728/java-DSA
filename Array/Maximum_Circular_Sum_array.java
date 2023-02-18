import java.util.*;
import java.io.*;
import java.lang.*;
class Maximum_Circular_Sum_array
{
// {5, -2, 3, 4}
     static int normal_max(int arr[],int n){

         int res=arr[0];
         int maxEnding=arr[0];
         for(int i=0;i<n;i++){
             maxEnding=Math.max(arr[i],maxEnding+arr[i]);
             res=Math.max(maxEnding,res);
         }
         return res;

    }


    static int maxCircularSum(int arr[], int n)
    {
       int normalmax=normal_max(arr,n);
       if(normalmax<0){
           return normalmax;
       }
       int currsum=0;
       int reversesum=0;
       for(int i=0;i<n;i++){
           currsum+=arr[i];
           arr[i]=-arr[i];
       }
       int  reversenormalSum=normal_max(arr,n);
       int res=Math.max(normalmax,reversenormalSum);
       return res;
    }


    public static void main(String args[])
    {
        int arr[] = {-3,4,6, -2}, n = 4;
       int res= maxCircularSum(arr, n);
        System.out.println(res);

    }

}