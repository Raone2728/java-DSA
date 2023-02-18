import java.util.*;
public class ArrayList_2 {
   static void swap(ArrayList<Integer> s1, int idx1, int idx2) {
          int temp=s1.get(idx1);
          s1.set(idx1,s1.get(idx2));
          s1.set(idx2,temp);
          System.out.println(s1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> s1 = new ArrayList<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        s1.add(60);

//        for(int i=s1.size()-1;i>=0;i--){   reverse
//            System.out.println(s1.get(i));
//        }
        //find maximum in arrayList
        int max = s1.get(0);
        for (int i = 1; i < s1.size(); i++) {
            if (s1.get(i - 1) < s1.get(i)) {
                max = s1.get(i);
            }

        }
//        System.out.println(max);

        //swap 2 numbers
        int idx1=2;
        int idx2=4;
        swap(s1, idx1, idx2);
    }


}
