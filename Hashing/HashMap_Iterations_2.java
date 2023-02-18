import java.util.*;
public class HashMap_Iterations_2 {
    public static void main(String[] args) {

        HashMap<String,Integer>hm=new HashMap<>();

        hm.put("tea",10);
        hm.put("coffe",40);
        hm.put("pizza",100);

         Set<String>key=hm.keySet();

//         System.out.println(key);   //not in ordered

        for (String k:key) {
            System.out.print(k+" and value is "+hm.get(k)+" ; ");
        }
//        System.out.println(hm.entrySet());

    }
}

