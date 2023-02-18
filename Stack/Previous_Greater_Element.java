//Input: 20,30,10,5,15
//OUtput:-1 -1 30 10 30
//----------------------------naive approach------------
//int arr[]={12,4,34,5,6,65};
//        int j;
//        for(int i=0;i<arr.length;i++){
//                                               Complexity=0(n2)
//        for( j=i-1;j>=0;j--){
//        if(arr[i]<arr[j]){
//        System.out.print(" "+arr[j]);
//        break;
//        }
//        }
//        if(j==-1){
//        System.out.print(" -1  ");
//        }
//        }
import java.util.*;
public class Previous_Greater_Element {
    public static void main(String[] args) {
        ArrayDeque<Integer>s=new ArrayDeque<>();
        int arr[]={20,30,10,5,15};
        s.push(arr[0]);
        System.out.print(" -1");
        for(int i=1;i<arr.length;i++){
            while(s.isEmpty()!=true && arr[i]>=s.peek()){
                s.pop();
            }
             int bg=(s.isEmpty())? -1:s.peek();
            System.out.print(" "+bg);
            s.push(arr[i]);
        }
    }
}
