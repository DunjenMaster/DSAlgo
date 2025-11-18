package DataStructure.BubbleSort;

class BubbleSortDemo1 {
    public static void main(String[] args){

        int[] num = {5,7,2,3,8,6};

        bubbleSort(num,num.length);
    }

    static void bubbleSort(int[] num, int n) {
        for(int i = 0; i < n-1; i++) {
            for( int j = 0; j<n-1-i; j++) {
                if(num[j] > num[j+1]) {
                    //swapping is required
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }

            printArray(num);
        }
    }

    static void printArray(int[] num) {
        for (int x: num){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}