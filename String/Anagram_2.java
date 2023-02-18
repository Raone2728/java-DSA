
import java.util.*;
public class Anagram_2 {

    public static boolean EfficientWay(String s1,String s2){
     if(s1.length()!=s2.length()) return false;
        int CHAR=256;
     int arr[]=new int [CHAR];

     for(int i=0;i<s1.length();i++){
          arr[s1.charAt(i)]++;
          arr[s2.charAt(i)]--;
     }
      for(int i=0;i<CHAR;i++){
          if(arr[i]!=0){
              return false;
          }

      }
      return true;

    }

    public static void main(String[] args) {
        String s1="listen";
        String s2="listen";



//        if(s1.length()!=s2.length())
//            System.out.println("false");
//
//        char arr[]=s1.toCharArray();
//        char arr2[]=s2.toCharArray();
//
//        Arrays.sort(arr);
//        Arrays.sort(arr2);
//        s1=new String(arr);
//        s2=new String(arr2);
//        if(s1.equals(s2))
//            System.out.println("true");
//        else
//            System.out.println("flase");

        boolean res=EfficientWay(s1,s2);
        System.out.println(res);
    }
}
