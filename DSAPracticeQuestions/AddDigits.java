package DataStructure.DSAPracticeQuestions;

public class AddDigits {

    static int addDigits(int num) {
        while(num >= 10) {
            int sum = 0;
            int temp = num;

            while(temp>0) {
                int digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
            }
            num = sum;
        }
        return  num;
    }

    public static void main(String[] args) {
        System.out.print("The single digit obtained by repeatedly adding the digits for the given number is: ");
        System.out.println(addDigits(38));

        System.out.print("The single digit obtained by repeatedly adding the digits for the given number is: ");
        System.out.println(addDigits(55));

        System.out.print("The single digit obtained by repeatedly adding the digits for the given number is: ");
        System.out.println(addDigits(21));
    }
}
