import java.util.*;

class Queue {
    int arr[];
    int size;
    int cap;

    Queue(int c) {
        cap = c;
        arr = new int[cap];
        size = 0;
    }

    void enqueue(int x) {
        if (size == cap) {
            System.out.println("size is full");
        }
        arr[size] = x;
        size++;
    }

    void dequeue() {
        if (size == -1) {
            System.out.println("dequeue is empty");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    int front() {
        if (size == -1) {
            System.out.println("dequeue is empty");
        }
        return arr[0];
    }

    int rear() {
        if (size == -1) {
            System.out.println("dequeue is empty");
        }
        return arr[size-1];
    }
}
    public class Implementation_of_Queue_using_Array {
        public static void main(String[] args) {
            Queue queue = new Queue(1000);

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);

            queue.dequeue();

            System.out.println("Front item is " + queue.front());

            System.out.println("Rear item is "
                    + queue.rear());
        }
    }

