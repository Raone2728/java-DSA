
import java.util.*;
public class HashSet_Iterator {
    public static void main(String[] args) {
        HashSet<Integer>hm=new HashSet<>();
        hm.add(9);
        hm.add(90);
        hm.add(80);
        hm.add(70);
        hm.add(30);
        hm.add(40);

        Iterator it= hm.iterator(); //  using Iterator
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        for(int i :hm){    //------->Enhanced for loop
            System.out.print(i+" ");
        }
    }
}
