
//  input=7,10,4,3,6,5,2  elements should have smallest element right side of a array
//  output=10,6,5,2

import java.util.*;
public class Leaders_in_array {
    public static void main(String[] args) {
        int arr[]={20,49,58,29,48,38,57,20};
        int n=arr.length;
        int curr=arr[n-1];
        System.out.print(curr+" ,");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>curr){
                curr=arr[i];
                System.out.print(curr+" ,");
            }
        }
    }
}
