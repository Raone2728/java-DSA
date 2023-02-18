package Stack;

import java.io.*;
import java.util.*;

class Largest_Rectangular_Area_in_a_Histogram {

    public static int getMaxAreaNaive_Approach(int arr[],int n){


        int max=0;
        for(int i=0;i<n;i++) {
            int curr = arr[i];
            int sum=curr;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= curr) {
                    sum+= curr;
                }
                else{
                    break;
                }
            }
            for (int k = i + 1; k < n; k++) {
                if (curr <= arr[k]) {
                    sum+= curr;
                }
                else{
                    break;
                }
            }
            max = Math.max(sum, max);
        }
          return max;
    }



    public static int getMaxArea_Efficient(int arr[],int n){
                return 0;
    }

    public static void main (String[] args) {

        int[] arr={6,2,5,4,1,5,6};

        System.out.print("Maximum Area: "+getMaxAreaNaive_Approach(arr,arr.length));
//          System.out.print("Maximum Area: "+getMaxArea_Efficient(arr,arr.length));
    }

}