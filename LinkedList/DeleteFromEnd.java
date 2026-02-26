public class DeleteFromEnd {
    static Node deleteFromEnd(Node head) {
        //check if list is empty
        if (head == null) {
            return null;
        }
        // check if list has only single node if have delete it
        if (head.next == null) {
            return null;
        }
        Node secondLast=head;
        while (secondLast.next.next != null) {
            secondLast=secondLast.next;
        }
        secondLast.next=null;

        return head;
    }
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" -> ");

            }
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Creating a static linked list
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("List before Deletion: ");
        printList(head);

        head = deleteFromEnd(head);
        System.out.println("List after Deletion: ");
        printList(head);

    }
}
