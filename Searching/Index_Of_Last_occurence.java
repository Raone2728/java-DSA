import java.util.*;
public class Index_Of_Last_occurence {
    static int binarySeach(int arr[],int x){

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
                if(mid==arr.length-1 || arr[mid+1]!=arr[mid]){
                    return mid;
                }
                else{
                  low=mid+1;
                }
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