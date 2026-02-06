package DataStructure.LeetCode.BinarySearchTree;

public class PeakIndexInAMountainArray {

    static int peakMountainArrayIndex(int[] arr) {

        int startIndex = 0;
        int lastIndex = arr.length - 1;

        while(startIndex < lastIndex) {
            int midIndex = (startIndex + (lastIndex - startIndex)/2);

            if(arr[midIndex] < arr[midIndex + 1]) {
                startIndex = midIndex + 1;
            }  else {
                lastIndex = midIndex;
            }
        }
        return startIndex;
    }


    public static void main(String[] args) {
        int[] mountainArray = {0,10,5,2};
        int[] mountainArray2 = {0,1,2,0};
        int[] mountainArray3 = {0,10,11,5,2};

        System.out.println("The Index of Peak Element is: " + peakMountainArrayIndex(mountainArray));
        System.out.println("The Index of Peak Element is: " + peakMountainArrayIndex(mountainArray2));
        System.out.println("The Index of Peak Element is: " + peakMountainArrayIndex(mountainArray3));
    }
}
