
import java.util.*;
public class Arraylist_3 {
    public static void main(String[] args) {
        ArrayList<Integer>s1=new ArrayList<>();
        s1.add(40);
        s1.add(90);
        s1.add(30);
        s1.add(20);
        s1.add(60);
        s1.add(10);
        //sorting
        Collections.sort(s1);
        System.out.println(s1);
        Collections.sort(s1,Collections.reverseOrder());
        //Comparator-fnx Logic.
        System.out.println(s1);
        System.out.println(s1);

        for(int i=0;i<s1.size();i++){
            System.out.println("ok");
        }


    }
}
