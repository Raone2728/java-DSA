
import java.util.*;
class node{

    int data;
    node next;
    node prev;
    node(int data){
        data=data;
        next=prev=null;
    }

}

class LL{


    public node head;
    public void addNode(int data){
        node val=new node(data);
        if(head==null){
             val.next=null;
             val.prev=null;
             head=val;
             return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=val;
        temp.prev=temp.prev.prev;
    }
    public  void print(){
        node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }

    }


}

public class Doubly_LinkedList {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LL list=new LL();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            list.addNode(data);
        }
        list.print();
    }
}
