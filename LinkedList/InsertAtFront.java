public class InsertAtFront {
    static Node insertAtFront(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }

    // Function to print the contents
    // of the linked list
    static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the linked list 2->3->4->5
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        // Insert a new node at the
        // front of the list
        int x = 1;
        head = insertAtFront(head, x);

        printList(head);
    }
}
