//more than n/2 times
//input={8,3,4,8,8}
//output= value
import java.sql.SQLOutput;

public class Majority {
   static void confirm(int arr[],int res){
       int n=arr.length;
       int count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[res]==arr[i]){
                count++;
            }
            if(count >n/2){
                System.out.println(arr[res]);
                System.exit(0);
            }

        }
       System.out.println("-1");
    }

    public static void main(String[] args) {
        int arr[]={9,3,8,8,8};
        int n=arr.length;
        int res=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            if(count==0){
                res=i;
                count=1;
            }
            if(arr[i]!=arr[res]){
                count--;
            }

        }

        confirm(arr,res);

    }
}
