import java.util.HashSet;
public class HashSet_ {
    public static void main(String[] args) {
        HashSet<Integer>hm=new HashSet<>();
        hm.add(10);
        hm.add(20);
        hm.add(30);
        hm.add(10);
        hm.add(20);

        System.out.println(hm);

        if(hm.contains(20)){
            System.out.println("true");
        }
        hm.clear();
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
    }
}
