import java.util.Scanner;

public class ClosestNumber {

    public static int closestNumber(int n, int m) {
        int closestNum = 0;
        int min_Differenece = Integer.MAX_VALUE;

        for (int i = n - Math.abs(m); i < n + Math.abs(m); i++) {
            if (i % m == 0) {
                int difference = Math.abs(n - i);
                if (difference < min_Differenece
                        || (difference == min_Differenece && Math.abs(i) > Math.abs(closestNum))) {
                    min_Differenece = difference;
                    closestNum = i;
                }
            }
        }

        return closestNum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();
        int numM = sc.nextInt();

        System.out.println(closestNumber(numN, numM));

        sc.close();
    }

}
