
import java.util.*;
public class Largest_Sub_Array_with_0_Sum {
    static int index(int arr[],int n){
        HashMap<Integer,Integer>hm= new HashMap<>();
        int sum=0;
        int length=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(hm.containsKey(sum)){
                length=i-hm.get(sum);
            }
            else{
                hm.put(sum,i);
            }
            max=Math.max(length,max);
        }

        return max;

    }

    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        int n=arr.length;

        int res=index(arr,n);
        System.out.println(res);

    }
}
