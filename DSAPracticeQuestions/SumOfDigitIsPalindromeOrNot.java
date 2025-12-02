package DataStructure.DSAPracticeQuestions;

public class SumOfDigitIsPalindromeOrNot {

    static boolean digitIsPalindrome(int n) {
        int temp = n;
        int sum = 0;

        while(temp>0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        int originalSum = sum;
        int reversedSum = 0;

        while(sum > 0) {
            int digit = sum % 10;
            reversedSum = reversedSum * 10 + digit;
            sum = sum / 10;
        }

        return (reversedSum == originalSum);

    }

    public static void main(String[] args) {
        System.out.println(digitIsPalindrome(56));  // true (5+6=11)
        System.out.println(digitIsPalindrome(98));  // false (9+8=17)
        System.out.println(digitIsPalindrome(121)); // true (1+2+1 = 4 → 4 is palindrome → true)
        System.out.println(digitIsPalindrome(131)); // true (1+3+1 = 5 → 5 is palindrome → true)
        System.out.println(digitIsPalindrome(123)); // true (1+2+3 = 6 → palindrome → true)
        System.out.println(digitIsPalindrome(86)); // false (8+6=14)
    }
}


