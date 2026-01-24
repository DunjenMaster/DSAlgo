import java.util.Scanner;

public class SumSquareNNatuarlNumber {

    static int sumSquare(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (i * i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ss = sc.nextInt();
        System.out.println(sumSquare(ss));
        sc.close();
    }
}
