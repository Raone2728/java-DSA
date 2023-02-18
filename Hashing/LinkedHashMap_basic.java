
import java.util.*;
public class LinkedHashMap_basic {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lh= new LinkedHashMap<>();
        lh.put("tea",10);
        lh.put("coffee",20);
        lh.put("pizza",30);
        System.out.println(lh);
        //ordered
    }
}
