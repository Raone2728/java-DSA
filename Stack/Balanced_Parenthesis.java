

import java.util.*;
public class Balanced_Parenthesis{
   static boolean booleanMatching(char x,char y){
       return ((x=='(' && y==')') || (x=='{' && y=='}') || (x=='[' && y==']'));
   }
    public static void main(String[] args) {
        
        ArrayDeque<Character>s1= new ArrayDeque<>();
        String str="{[][}";
        int i=0;
        int n=str.length();
        while(i<n){
           char x=str.charAt(i);
            if(x=='{' || x=='[' || x=='('){
                s1.push(x);
            }
            else{
                 if(s1.isEmpty()==true){
                     System.out.println(" Not Balanced ");
                 }
                else if(booleanMatching(s1.peek(),x)==false){
                   System.out.println("Not baLanced");
                   System.exit(0);
                }
                else{
                    s1.pop();
                }

            }
            i++;
        }
        if(s1.isEmpty()==true){
            System.out.println("balanced");

            }
        else{
            System.out.println("Not balanced");

        }

    }
    
}