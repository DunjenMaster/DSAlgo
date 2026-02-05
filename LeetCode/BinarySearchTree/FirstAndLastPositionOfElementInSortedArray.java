package DataStructure.LeetCode.BinarySearchTree;

import java.util.Scanner;

public class FirstAndLastPositionOfElementInSortedArray {

    public static int firstOccurrence(int[] arr, int key) {

        int startIndex = 0;
        int endIndex = arr.length-1;
        int midIndex = (startIndex + (endIndex - startIndex)/2);
        int ans = -1;

        while(startIndex <= endIndex) {
            if(arr[midIndex] == key) {
                ans = midIndex;
                endIndex = midIndex - 1;
            } else if (key>arr[midIndex]) {
                startIndex = midIndex + 1;
            }else if (key < arr[midIndex]) {
                endIndex = midIndex - 1;
            }

            midIndex = (startIndex + (endIndex - startIndex)/2);
        }

        return ans;
    }

    public static int lastOccurrence(int[] arr, int key) {

        int startIndex = 0;
        int endIndex = arr.length - 1;
        int midIndex = (startIndex + (endIndex - startIndex)/2);
        int ans = -1;

        while(startIndex <= endIndex) {
            if(arr[midIndex] == key) {
                ans = midIndex;
                startIndex = midIndex + 1;
            }else if(key > arr[midIndex]) {
                startIndex = midIndex + 1;
            }else if(key < arr[midIndex]) {
                endIndex = midIndex - 1;
            }

            midIndex = (startIndex + (endIndex - startIndex)/2);
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] numList = {5,7,7,8,8,10};
        System.out.println("First occurrence for the target number at Index position is: " + firstOccurrence(numList, 7));
        System.out.println("Last occurrence for the target number at Index position is: " + lastOccurrence(numList,7));

    }
}
