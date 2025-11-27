package DataStructure.DSAPracticeQuestions;

class PrimeNumberCheck {
    public static boolean isPrime(int n) {

        // Edge Case 1: Numbers <= 1 are not prime
        if (n <= 1) {
            return false;
        }

        // Edge Case 2: 2 is the only even prime
        if (n == 2) {
            return true;
        }

        // Edge Case 3: Any even number greater than 2 is not prime
        if (n % 2 == 0) {
            return false;
        }

        // Brute Force: Check divisors from 2 to n-1
        for (int i = 3; i < n; i++) {
            if (n % i == 0) {
                return false; // divisor found → not prime
            }
        }

        // No divisors found → prime
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));    // true
        System.out.println(isPrime(25));   // false
        System.out.println(isPrime(1));    // false
        System.out.println(isPrime(2));    // true
        System.out.println(isPrime(10));   // false
    }
}