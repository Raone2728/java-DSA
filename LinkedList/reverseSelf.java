
import java.util.*;
public class reverseSelf {
    static Node head;
    static class Node{
        Node next;
        int data;
        Node(int x){
            data=x;
            next=null;
        }

    }

    public static Node reverse(Node head){
              Node prev=null;
              Node curr=head;

              while(curr!=null){
                  Node next=curr.next;
                  curr.next=prev;
                  prev=curr;
                  curr=next;
              }

              return prev;
    }


    public static void addNode(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
         Node temp=head;
        while(temp.next!=null){
              temp=temp.next;
        }
        temp.next=newNode;

    }



    public static void print(Node head){

        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            addNode(sc.nextInt());
        }
        head=reverse(head);
        print(head);

    }
}
