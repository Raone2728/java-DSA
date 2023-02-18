
import java.util.*;
public class Covert_arrayList_to_array {
    static int[] problem(int[] arr){
        ArrayList<Integer>s1=new ArrayList<>();
        s1.add(89);
        s1.add(90);
        s1.add(34);
        s1.add(39);
        s1.add(20);

        int[] n = (int[])s1.toArray(int[s1.size()]);
        return n;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
       int arr3[] =problem(arr);
        System.out.println(arr3[2]);
    }
}
