import java.util.ArrayDeque;

public class Stack_in_Java_Collections {
    public static void main(String[] args) {
        ArrayDeque<Integer>s=new ArrayDeque<>();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());

    }
}
