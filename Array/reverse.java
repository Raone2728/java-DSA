
public class reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
           int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
          low++;
          high--;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }

}
