/*Given an integer array arr[], compute the sum of all
possible sub-arrays of the array. A sub-array is a contiguous part of the array.*/

public class SumOfAllSubArray {

    public static int subarraySum(int[] arr) {

        int n = arr.length;
        int result = 0;

        // Computing sum of subarrays using the formula
        for (int i = 0; i < n; i++) {
            result += (arr[i] * (i + 1) * (n - i));
        }

        // Return the sum of all subarrays
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2};
        System.out.println(subarraySum(arr));
    }
}
