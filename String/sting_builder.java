
import java.util.*;
public class sting_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(" ");
        for(char ch='a';ch<='z';ch++){
              sb.append(ch);
        }
         sb.toString();
        System.out.println(((Object)sb).getClass().getSimpleName());
    }
}
