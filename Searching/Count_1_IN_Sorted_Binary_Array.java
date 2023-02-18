public class Count_1_IN_Sorted_Binary_Array {

   static int binarySearchFirstIndex(int arr[],int x){

       int low=0;
       int high=arr.length-1;

       while(low<=high){
           int mid=(low+high)/2;

           if(arr[mid]<x){
               low=mid+1;
           }
           else if(arr[mid]>x){
               high=mid-1;
           }
           else{
               if(mid==0 || arr[mid-1]!=arr[mid]){
                   return mid;
               }
               else{
                   high=mid-1;
               }
           }

       }


       return -1;
   }

    static int countNumber(int arr[]){
       int x=1;
        int n=arr.length-1;
        int first=binarySearchFirstIndex( arr, x);

        int ans=n-first+1;

        return ans;
    }

    public static void main(String[] args) {
        int arr[]={0,0,0,0,1,1,1,};
        System.out.println(countNumber(arr));
    }
}
