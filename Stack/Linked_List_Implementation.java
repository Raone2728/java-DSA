
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }

}

 class LL_Stack{

    Node head;
    int sz;
    LL_Stack(){
       head=null;
       sz=0;
    }
    void push(int x){
       Node temp=new Node(x);
       temp.next=head;
       head=temp;
       sz++;
    }

       int  pop(){
        int res=head.data;
        head=head.next;
        sz--;
        return res;
    }
    int peek(){
        int res=head.data;
        return res;
     }
     boolean isEmpty(){
        return head==null;
     }
     int size(){
        return sz+1;
     }




 }


public class Linked_List_Implementation {
    public static void main(String[] args) {
       LL_Stack s=new LL_Stack();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
