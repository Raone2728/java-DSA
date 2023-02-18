import java.util.*;
import java.io.*;
import java.lang.*;
class Check_if_array_is_Sorted
{
    static boolean isSorted(int arr[], int n)
    {
        boolean flag=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
       return flag;
    }

    public static void main(String args[])
    {
        int arr[] = {7, 8, 30, 40}, n = 4;

        System.out.println(isSorted(arr, n));
    }
}