//
//input=[10,12,14,7,8]
//output=3;


import java.util.*;
public class Longest_Even_Odd_subArrays {
    public static void main(String[] args) {
        int arr[]= {5, 10, 20, 6, 3, 8};
        int n=arr.length;
        int count=0;
        int max=0;

        for(int i=0;i<n-1;i++) {
            if ((arr[i] % 2 == 0 || arr[i + 1] % 2 != 0) && (arr[i] % 2 != 0 || arr[i] % 2 == 0)) {
                  count++;
                  max=Math.max(count,max);

            }
            else{
                count=1;
            }
        }
        System.out.println(max);
    }
}
