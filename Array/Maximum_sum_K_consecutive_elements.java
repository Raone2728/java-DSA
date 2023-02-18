import java.util.*;
class Maximum_sum_K_consecutive_elements
{
//  9 7 6 7 9 9
    static int maxSum(int arr[], int n, int k)
    {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;
        for(int i=k-1;i<n-k;i++){
            sum+=arr[i+1]-arr[i-1];
            max=Math.max(sum,max);
        }
        return max;
    }


    public static void main(String args[])
    {
        int arr[] = {5,-10,6 ,90,3}, n = 6, k = 2;

        System.out.println(maxSum(arr, n, k));

    }

}