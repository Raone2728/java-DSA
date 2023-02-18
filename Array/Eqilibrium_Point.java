import java.util.*;
public class Eqilibrium_Point {
    public static void main(String[] args) {
        int arr[]={4,2,-2};
        int n=arr.length;
        int res=0;
        int lsum=0;

        for(int i=0;i<n;i++){
            res+=arr[i];
        }

        for(int i=0;i<n;i++){
           res-=arr[i];
            if(res==lsum){
                System.out.println("yes");
                System.exit(0);
            }
            lsum+=arr[i];
        }


    }
}
