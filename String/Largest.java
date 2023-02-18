
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        String str[]={"apple","magno","banana"};
        int n= str.length;
        String max=str[0];
       for(int i=1;i<n;i++){
           if(max.compareToIgnoreCase(str[i])<0){
                    max=str[i];
           }
       }
        System.out.println(max);
    }
}
