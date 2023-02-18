


import java.util.*;
class TwoStacks{
    int arr[];
    int top1;
    int top2;
    int cap;
    TwoStacks(int c){
       arr=new int[c];
        cap=c;
        top1=-1;
        top2=cap;
    }
     void push1(int x){
        if(top1<top2-1){
            top1++;
            arr[top1]=x;
        }
        else {
            System.out.println("STack over flow");
            System.exit(1);
        }
    }
    void push2(int x){
        if(top1<top2-1){
            top2--;
            arr[top2]=x;
        }
        else {
            System.out.println("STack over flow");
            System.exit(1);
        }
}
    int pop1(){
        if(top1==-1){
            System.out.println("Nothing to pop");
        }
        int res=arr[top1];
        top1--;
        return res;
    }

    int pop2(){
        if(top2==cap){
            System.out.println("Nothing to pop");
        }
        int res=arr[top2];
        top1++;
        return res;
    }


}

public class Implement_two_Stacks_in_an_Array {
    public static void main(String[] args) {
        TwoStacks ts=new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is: " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is: " + ts.pop2());

    }
}
