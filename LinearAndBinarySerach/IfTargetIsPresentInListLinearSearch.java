package DataStructure.LinearAndBinarySerach;

public class IfTargetIsPresentInListLinearSearch {
    public static void main(String[] args){

        int nums[] = {1, 2, 3, 5, 6, 7, 9, 10, 11, 13};
        int target = 11;

        int result = linearSearch(nums, target);

        if(result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found in the array");

    }

    public static int linearSearch(int[] nums, int target){
        int steps = 0;
        for(int i = 0; i<nums.length; i++) {
            steps++;
            if(nums[i] == target) {
                System.out.println("Steps taken to find the element by LinearSearch: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken to find the element by LinearSearch: " + steps); // In  case element is not found in the array
        return -1;
    }
}
