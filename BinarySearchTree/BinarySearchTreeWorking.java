package DataStructure.BinarySearchTree;

public class BinarySearchTreeWorking {

    public static int binaryTree(int[] arr, int key) {

        int startIndex = 0;
        int endIndex = arr.length-1;
        int midIndex = ((startIndex + endIndex)/2);

        while(startIndex <= endIndex) {

            if(arr[midIndex] == key) {
                return midIndex;
            }

            if(key > arr[midIndex]) {
                startIndex = midIndex + 1;
            }else {
                endIndex = midIndex - 1;
            }

            midIndex = (startIndex + endIndex)/2;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] even = {2,4,6,8,12,18};
        int[] odd = {3,8,11,14,16};

        System.out.println("Check the index present in the Even List " + binaryTree(even,20));
        System.out.println("Check the index present in the Odd List " + binaryTree(odd,5));


    }
}
