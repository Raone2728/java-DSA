
import java.util.*;
class Solution{
        int getMinDiff(int[] arr, int n, int k) {
            Arrays.sort(arr);

            int ans = arr[n-1]-arr[0];

            int smallest = arr[0]+k;

            int largest  = arr[n-1]-k;

            int mi,ma;



            for(int i=0;i<n-1;i++){

                mi=Math.min(smallest,arr[i+1]-k);

                ma=Math.max(largest,arr[i]+k);



                if(mi<0){

                    continue;

                }

                ans=Math.min(ans,ma-mi);

            }

            return ans;

        }
    }


    class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(new Solution().getMinDiff(nums,n,k));
    }
}