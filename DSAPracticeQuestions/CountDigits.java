package DataStructure.DSAPracticeQuestions;

public class CountDigits {

    static int countDigit(int n) {
        int originalNumber = n;
        int count = 0;

        while(n > 0) {
            int  digit = n % 10;
            if(digit != 0) {
                if(originalNumber % digit == 0) {
                    count ++;
                }
            }
            n = n /10;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println("The count of digits that divide the number evenly is: ");
        System.out.println(countDigit(12));
    }
}
