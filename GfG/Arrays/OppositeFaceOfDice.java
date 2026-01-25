import java.util.Scanner;

class OppositeFaceOfDice {

    public static int oppositeFaceOfDice(int n) {

        // Brute Approach
        // int ans1 = 0;
        // if (n == 1)
        // return 6;
        // if (n == 2)
        // return 5;
        // if (n == 3)
        // return 4;
        // if (n == 4)
        // return 3;
        // if (n == 5)
        // return 2;
        // if (n == 6)
        // return 1;
        // return ans1;

        // Optimized Approach
        // return 7 - n;

        int ans2 = 7 - n;
        return ans2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(oppositeFaceOfDice(num));
        sc.close();

    }

}