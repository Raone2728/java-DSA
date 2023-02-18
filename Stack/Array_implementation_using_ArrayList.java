
import java.util.*;


class MyStack{
    ArrayList<Integer>s=new ArrayList<>();

    void push(int p){
        s.add(p);
    }

    int pop(){
        int res=s.get(s.size()-1);
        s.remove(s.size()-1);
        return res;
    }

    int peek(){
        int res=s.get(s.size()-1);
        return res;
    }
    boolean isEmpty(){
        return s.isEmpty();
    }
    int size(){
        return s.size();
    }





  }

public class Array_implementation_using_ArrayList {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}