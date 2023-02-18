
//------------------------Input=[5,10,20,15,7]--------
//------------------------Output=20---------------
//
//----------------------------------Input=[10,20,15,5,23,90]--------------\
//-------------------------output=20,90----------------------
//
//-------------------------Input=[80,70,90]----------------------------
//-------------------------Output=80,90------------------
import java.util.*;


public class Find_A_Peak_Element {
    static int naiveApproach_getPeak(int arr[],int n){

        if(n<2) {
            if (arr[0] >= arr[1]) {
                return arr[0];
            } else if(arr[n-1]>arr[n-2]){
                return arr[n-1];

            }
        }


        int i=1;
        while(i<n-1){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
            i++;
        }



        return 0;
    }

    public static void main(String args[]) {
        int arr[] = {5, 10, 11, 12, 20, 12}, n = 6;

        System.out.println(naiveApproach_getPeak(arr,n));

    }
}
