import java.util.Scanner;

public class LinkedListMain {

    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the linked list: ");
        for (int i = 0; i < n; i++) {
            addNode(sc.nextInt());
        }
        System.out.println("Original linked list: ");
        printList(head);
        head = reverse(head);
        System.out.println("\nReversed linked list: ");
        printList(head);
    }
}
