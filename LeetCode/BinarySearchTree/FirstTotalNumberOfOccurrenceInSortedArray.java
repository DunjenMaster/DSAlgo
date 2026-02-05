package DataStructure.LeetCode.BinarySearchTree;

public class FirstTotalNumberOfOccurrenceInSortedArray {

    static int firstOccurrence(int[] arr, int key) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int ans = -1;

        while(startIndex <= endIndex) {
            int midIndex = (startIndex + (endIndex - startIndex)/2);
            if(arr[midIndex] == key) {
                ans = midIndex;
                endIndex = midIndex - 1;
            }else if(key > arr[midIndex]) {
                startIndex = midIndex +1;
            }else if(key < arr[midIndex]) {
                endIndex = midIndex - 1;
            }
        }
        return ans;
    }

    static int lastOccurrence(int[] arr, int key) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int ans = -1;

        while(startIndex <= endIndex) {
            int midIndex = (startIndex + (endIndex - startIndex)/2);
            if(arr[midIndex] == key) {
                ans = midIndex;
                startIndex = midIndex + 1;
            }else if(key > arr[midIndex]) {
                startIndex = midIndex + 1;
            }else if(key < arr[midIndex]) {
                endIndex = midIndex - 1;
            }
        }

        return ans;
    }

    static int totalNoOfOccurrence(int[] arr, int key) {

        int first = firstOccurrence(arr,key);
        int last = lastOccurrence(arr,key);

        return last - first + 1;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,3,3,5};
        System.out.println("Total number of occurrence for the given element in the array is: " + totalNoOfOccurrence(arr, 3));
    }
}
