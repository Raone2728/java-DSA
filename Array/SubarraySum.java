class SubarraySum
{
    /* Returns true if the there is a subarray of arr[] with sum equal to
    'sum' otherwise returns false. Also, prints the result */
    int subArraySum(int arr[], int n, int sum)
    {
        int currSum=0;
        int j=0;
        boolean flag=true;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if(currSum==sum){
                flag=false;
                System.out.println("yes");
            }
            if(currSum>sum){
                currSum-=arr[j];
                j++;
            }
        }
         if(flag==true){
             System.out.println("Not found");
         }
      return 0;
    }

    public static void main(String[] args)
    {
        SubarraySum arraysum = new SubarraySum();
        int arr[] = {1,4,0,0,2,10,5};
        int n = arr.length;
        int sum = 7;
        arraysum.subArraySum(arr, n, sum);
    }
}

