
import java.util.*;
public class Subarray_with_Given_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={15, 2, 4, 8, 9, 5, 10, 23};
        int x=23;

         int sum=0;
         int start=0;
        for(int i=0;i<arr.length;i++){
            if(sum==x){
                System.out.println("true");
                System.exit(0);
            }
            while(sum+arr[i]>x){
                sum-=arr[start];
                start++;
            }
            sum+=arr[i];
        }

    }
}
