import java.util.Scanner;

public class CheckEvenOrOdd {

    static boolean EvenOrOdd(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        System.out.println();

        if (EvenOrOdd(check)) {
            System.out.println("Enterd number " + check + " is Even.");
        } else
            System.out.println("Enterd number " + check + " is Odd.");

        sc.close();
    }

}
