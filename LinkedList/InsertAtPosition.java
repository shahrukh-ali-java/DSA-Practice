public class InsertAtPosition {
    public static Node insertAtPosition(Node head, int val, int pos) {
        Node newNode = new Node(val);
        if (pos == 1) {
            newNode.next=head;
            return newNode;
        }
        Node temp=head;
        int count=1;
        while (temp != null && count < pos - 1) {
            temp=temp.next;
            count++;
        }

        // if position is greater then list
        if (temp == null) {
            return head;
        }
        // insert the newNode at given position
        newNode.next=temp.next;
        temp.next=newNode;

        return head;
    }
    public static void printList(Node head) {
      Node temp=head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp=temp.next;
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
        head = insertAtPosition(head, 25, 3);
        System.out.println("List after Insertion: ");
        printList(head);

    }
}
