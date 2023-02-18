
//Input:s1=ABCD ,s2=AD
//output=True

import java.util.*;
public class Subsequence_1 {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="BA";
        int n=str2.length();
        boolean flag=true;
        int j=0;
        for(int i=0;i<str1.length() && j<str2.length();){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }

        }
        if(j==n){
            System.out.println("True");
        }
        else
        System.out.println("false");


    }
}
