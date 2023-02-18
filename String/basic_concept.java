import java.util.*;
public class basic_concept {
    public static void main(String[] args) {
        String str="Hello";
        String str1="Hello";
        String str3=new String("Hello");

        if(str1==str){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        if (str==str3){
            System.out.println("Equal");
        }
        else {
            System.out.println("NOt equal");
        }

        // for checking value
        if(str.equals(str3)){
            System.out.println("Equal");
        }
        //substring(0,4)----4 will not be included;
        System.out.println(str.substring(0,2));
    }
}
