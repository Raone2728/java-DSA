
//output=[2,3,-8,7,-1,2,3]
//output=11

import java.util.*;
public class Maximum_sum_subarrays_Kadane {
    public static void main(String[] args) {
        int arr[]={-3, 8, -2, 4, -5, 6};
        int n=arr.length;
        int res=arr[0];
        int profit=arr[0];


        for(int i=1;i<n;i++){
            res=Math.max(arr[i],arr[i]+res);
            profit=Math.max(res,profit);
        }
        System.out.println(profit);

    }
}

