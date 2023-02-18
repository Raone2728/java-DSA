
//INPUT=10,10,10,20,20,30
//output=10 3
//       20 2
//       30  1

import java.util.*;
public class Frequencies_in_a_sorted_array {
    public static void main(String[] args) {
        int arr[]={10,10,10,20,20,30};
        int n=arr.length;
        int count=1;
        int i=0;
        for( i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                System.out.println(arr[i]+" and count is "+count);
                count=1;
            }
        }
        if(count>=1){
            System.out.println(arr[i]+" and count is"+count);
        }

    }
}
