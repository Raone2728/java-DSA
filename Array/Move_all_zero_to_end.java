
//input=8,5,0,10,0,20
//output=8,5,10,20,0,0
public class Move_all_zero_to_end {
    public static void main(String[] args) {
        int arr[]={8,5,10,0,0,20,0};
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[res];
                arr[res]=arr[i];
                arr[i]=temp;
                res++;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ; ");
        }
    }
}
