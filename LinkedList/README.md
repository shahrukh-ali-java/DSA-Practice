class List_Traversal.{

Traversal of Singly Linked List (Iterative Approach)

The process of traversing a singly linked list involves printing the value of each node and then going on to the next node and print that node's value also and so on, till we reach the last node in the singly linked list, whose next node points towards the null.

Step-by-Step Algorithm:

We will initialize a temporary pointer to the head node of the singly linked list.
After that, we will check if that pointer is null or not null, if it is null, then return.
While the pointer is not null, we will access and print the data of the current node, then we move the pointer to next node.

Output
10 -> 20 -> 30 -> 40

Time Complexity: O(n), where n is the number of nodes in the linked list.
Auxiliary Space: O(1)


Traversal of Singly Linked List (Recursive Approach)
We can also traverse the singly linked list using recursion. We start at the head node of the singly linked list, check if it is null or not and print its value. We then call the traversal function again with the next node passed as pointer.

Step-by-Step Algorithm:

Firstly, we define a recursive method to traverse the singly linked list, which takes a node as a parameter.
In this function, the base case is that if the node is null then we will return from the recursive method.
We then pass the head node as the parameter to this function.
After that, we access and print the data of the current node.
At last, we will make a recursive call to this function with the next node as the parameter.


Output
10 -> 20 -> 30 -> 40

Time Complexity: O(n), where n is the number of nodes in the linked list.
Auxiliary Space: O(n), because of recursive stacK space

}


