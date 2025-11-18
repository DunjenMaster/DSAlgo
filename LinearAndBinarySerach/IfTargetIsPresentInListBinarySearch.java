package DataStructure.LinearAndBinarySerach;

/**
 * This class demonstrates the implementation of a binary search algorithm
 * to determine if a target element is present in a sorted array.
 */
public class IfTargetIsPresentInListBinarySearch {

    /**
     * The main method serves as the entry point of the program.
     * It initializes a sorted array and a target value, performs a binary search,
     * and prints the result.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Initialize a sorted array of integers
        int nums[] = {1, 2, 3, 5, 6, 7, 9, 10, 11, 13};
        // Define the target value to search for
        int target = 11;

        // Perform binary search to find the target in the array
        int result = binarySearch(nums, target);

        // Print the result of the search
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found in the array");
    }

    /**
     * Performs a binary search on a sorted array to find the index of the target value.
     *
     * @param nums   The sorted array of integers to search in.
     * @param target The value to search for.
     * @return The index of the target value if found, otherwise -1.
     */
    public static int binarySearch(int[] nums, int target) {
        int steps = 0; // Variable to count the number of steps taken;
        // Initialize the left and right pointers
        int left = 0;
        int right = nums.length - 1;

        // Continue searching while the left pointer is less than or equal to the right pointer
        while (left <= right) {
            steps++;
            // Calculate the middle index
            int mid = (left + right) / 2;

            // Check if the middle element is the target
            if (nums[mid] == target) {
                System.out.println("Steps taken to find the element by BinarySearch: " + steps);
                return mid;
            }
            // If the target is greater, adjust the left pointer
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // If the target is smaller, adjust the right pointer
            else
                right = mid - 1;
        }

        // Return -1 if the target is not found
        System.out.println("Steps taken to find the element by BinarySearch: " + steps);
        return -1;
    }
}
