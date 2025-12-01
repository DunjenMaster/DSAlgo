package DataStructure.DSAPracticeQuestions;

public class DivisorOfANumber {

    static void divisorCount(int n) {

        for(int i = 1; i <=n ; i++ ) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("The divisors of the given number are: ");
        divisorCount(12);
    }
}
