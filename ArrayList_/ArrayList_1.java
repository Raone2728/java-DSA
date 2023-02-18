import java.util.*;
public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer>s1=new ArrayList<Integer>();
                s1.add(30);
                s1.add(40);
                s1.add(50);
                s1.add(60);
                s1.add(70);

                //s1.add(1,9)----30 9 40 50 60 70

              //to delete an element
                s1.remove(0);
                System.out.println(s1.get(0));
                System.out.println(s1);

                //set Element
               s1.set(0,459);
               System.out.println(s1);

               //contains
               System.out.println(s1.contains(70));
               //size
        //      System.out.println(s1.size());

//                for(int i=0;i<s1.size();i++){
//                    System.out.println(s1.get(i));
//                }



    }
}