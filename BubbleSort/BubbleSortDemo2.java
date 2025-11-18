package DataStructure.BubbleSort;

class BubbleSortDemo2 {
    public static void main(String[] args) {

        int[] num = {5, 7, 2, 3, 8, 6};

        bubbleSort(num, num.length);

        System.out.print("\nFinal Sorted Array: ");
        printArray(num);
    }

    static void bubbleSort(int[] num, int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.println("\n==============================");
            System.out.println("          PASS " + (i + 1));
            System.out.println("==============================");

            for (int j = 0; j < n - 1 - i; j++) {

                System.out.println("\nComparing " + num[j] + " and " + num[j + 1]);

                if (num[j] > num[j + 1]) {
                    System.out.println("Swap needed → Swapping " + num[j] + " and " + num[j + 1]);

                    // swap
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                } else {
                    System.out.println("No swap needed");
                }

                System.out.print("Array after comparison: ");
                printArray(num);
            }
        }
    }

    static void printArray(int[] num) {
        for (int x : num) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
