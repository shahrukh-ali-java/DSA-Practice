public class DeleteFromFront {
    public static Node deleteHead(Node head) {
        //check if list empty
        if (head == null) {
            return null;
        }
        // store current head in temporary variable
        Node temp=head;
        //Move the head pointer to the next node
        head=head.next;
        //free memory of old head node
        temp=null;

        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" -> ");

            }
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(8);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(7);

        head = deleteHead(head);
        printList(head);

        // Output: 2 -> 3 -> 1 -> 7
    }
}
