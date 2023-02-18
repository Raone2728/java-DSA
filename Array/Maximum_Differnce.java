
//Maximum differnce of arr[j]-arr[i] such that j<i
//input={2,3,10,6,4,8,1};
//output=8;
import java.util.*;
public class Maximum_Differnce {
    public static void main(String[] args) {
        int arr[]={2,3,10,6,4,8,1};
        int n=arr.length;
        int curr_max=arr[n-1]-arr[n-2];
        for(int i=n-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                if(arr[i]-arr[j]>curr_max){
                    curr_max=arr[i]-arr[j];
                }
            }

        }
        System.out.println(curr_max);
    }
}
