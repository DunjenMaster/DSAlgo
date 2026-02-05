// File: Arrays/SplitingArrayInChunks.java
package DataStructure.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitingArrayInChunks {

    public static List<int[]> splitArray(int[] arr, int splitSize) {
        List<int[]> chunks = new ArrayList<>();
        if (arr == null || splitSize <= 0) return chunks;

        for (int i = 0; i < arr.length; i += splitSize) {
            int end = Math.min(i + splitSize, arr.length);
            chunks.add(Arrays.copyOfRange(arr, i, end)); // use i as start
        }
        return chunks;
    }

    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int size = 1; size <= 6; size++) {
            System.out.println("Chunk size = " + size);
            List<int[]> list = splitArray(original, size);
            list.forEach(chunk -> System.out.println(Arrays.toString(chunk)));
            System.out.println();
        }
    }
}
