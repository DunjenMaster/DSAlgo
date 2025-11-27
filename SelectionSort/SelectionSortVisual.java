package DataStructure.SelectionSort;

public class SelectionSortVisual {
    public static void main(String[] args) {

        int[] nums = {6, 5, 2, 8, 9, 4};
        int n = nums.length;

        System.out.println("Original Array:");
        printArray(nums);
        System.out.println();

        // Selection sort starts here
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;   // take the FIRST element of the unsorted part
            System.out.println("---------------------------------------------------");
            System.out.println("PASS " + (i + 1) + " → Starting from index " + i);
            System.out.println("Assume nums[" + i + "] = " + nums[i] + " is the MIN");

            // compare with every other element after i
            for (int j = i + 1; j < n; j++) {
                System.out.println("Comparing min(" + nums[minIndex] + ") with " + nums[j]);

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;  // found a new minimum
                    System.out.println("→ NEW MIN found: " + nums[j] + " at index " + j);
                }
            }

            // Swap the first element with the minimum element found
            System.out.println("Minimum of this pass = " + nums[minIndex] +
                    " at index " + minIndex);

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

            System.out.println("Array after PASS " + (i + 1) + ": ");
            printArray(nums);
            System.out.println();
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Final Sorted Array:");
        printArray(nums);
    }

    // Utility function to print the array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

