/*
Problem: Sum of elements in an array
Topic: Arrays
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of array elements = " + sum);
    }
}
