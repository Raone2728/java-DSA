import java.util.*;
class queue{

    int arr[];
    int size,front,rear;
    int cap;
    queue(int c){
        cap=c;
        arr=new int[cap];
        size=0;
        front=0;
        rear=cap-1;
    }
    boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

    boolean isFull(){
        return size==cap;
    }
    void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
        }
    }





}
public class Implementation_of_Queue_using_Circular_Array {
    public static void main(String[] args) {
        queue q = new queue(1000);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println(q.dequeue()
                + " dequeued from queue\n");

        System.out.println("Front item is "
                + q.front());

        System.out.println("Rear item is "
                + q.rear());
    }
}