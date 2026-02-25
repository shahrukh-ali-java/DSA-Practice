public class InsertAtEnd {

    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(50);

        // if list is empty then newNode is head
        if (head == null) {
            return newNode;
        }
        Node last=head;
        while (last.next != null) {
            last=last.next;
        }
        last.next=newNode;

        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            if (head.next != null) {
                System.out.print(" -> ");

            }
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("List before Insertion: ");
        printList(head);

        head = insertAtEnd(head, 50);
        System.out.println("List after Insertion: ");
        printList(head);

    }
}
