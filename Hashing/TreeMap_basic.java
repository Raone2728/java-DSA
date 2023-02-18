
import java.util.*;
public class TreeMap_basic {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm= new TreeMap<>();
        tm.put("tea",10);
        tm.put("coffee",20);
        tm.put("pizza",30);
        System.out.println(tm);
        //keys are sorted NOT VALUE
    }
}
