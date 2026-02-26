public class DeleteFromPosition {
    static Node deleteFromPosition(Node head, int pos) {
        Node temp=head; // first node reference store in temporary variable
      // first node(Head) is to be deleted when position is 1
        if (pos == 1) {
            head=head.next;
            temp=null;
            return head;
        }

       int count=1;
        while (temp != null && count < pos - 1) {
            temp=temp.next;
            count++;
        }
        // when position is invalid
        if (temp == null || temp.next == null) {
            return head;
        }
        temp.next=temp.next.next;

        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("nullptr");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int position = 3;
        System.out.println("List before Deletion: ");
        printList(head);

        head = deleteFromPosition(head, position);
        System.out.println("List after Deletion: ");
        printList(head);

    }


}
