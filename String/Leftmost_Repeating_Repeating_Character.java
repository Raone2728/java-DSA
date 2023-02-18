
import java.util.*;
public class Leftmost_Repeating_Repeating_Character {
    public static void main(String[] args) {
        String str = "RitikRanjanSingh";
        int CHAR=256;
        int arr[]=new int[256];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;

        }
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]>1){
                System.out.println(str.charAt(i));
                flag=false;
                break;
            }

        }
        if(flag==true){
            System.out.println("-1");
        }

    }
}
