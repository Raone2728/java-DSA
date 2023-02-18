
import java.util.*;
public class Uppercase_ {
    static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                sb.append(Character.toUpperCase(str.charAt(i+1)));
                i++;
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
         String str="Ritk ranjan singh";
        String res= toUpperCase(str);
        System.out.println(res);
    }
}
