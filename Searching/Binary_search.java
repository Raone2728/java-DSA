//first line of input is array length
// element in the array
// x element to be found:
// 10,20,30,40,50
//search(30)
//outp
import java.util.*;
public class Binary_search {
    static int binarySeach(int arr[],int x){

        int low=0;
        int high=arr.length;

        while(low<=high){
             int mid=(low+high)/2;

             if(arr[mid]==x){
                 return mid+1;
             }
             else if(arr[mid]>x){
                 high=mid-1;
             }
             else{
                 low=mid+1;
             }

        }


        return -1;
    }


    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int x=Sc.nextInt();
        int result=0;
         result=binarySeach(arr,x);

         System.out.println("index = "+result+"");


    }

}
