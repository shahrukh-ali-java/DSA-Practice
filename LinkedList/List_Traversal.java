

public class List_Traversal {
    public static void traverseList(Node head) {

        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" -> ");
            } else {
                System.out.print(" -> null ");
            }
            head = head.next;

        }
        System.out.println();
    }

    public static void recursiveTraversal(Node head) {

        //Base Case
        if (head == null) {
            System.out.println();
            return;
        }

        System.out.print(head.data);  // print the current node data

   // print arrow if not the last node
        if (head.next != null) {
            System.out.print(" -> ");

        }

        recursiveTraversal(head.next); // moving to next node
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(50);
        head.next.next.next = new Node(40);

        traverseList(head);
        recursiveTraversal(head); // recursive method call head as a argument pass

    }
}
