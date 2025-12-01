package DataStructure.DSAPracticeQuestions;

public class ThreeDigitArmstrongNumber {

    static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;
            sum = sum + (digit*digit*digit);
            n = n/10;
        }
        if(sum == originalNumber) {
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(123));
    }
}
