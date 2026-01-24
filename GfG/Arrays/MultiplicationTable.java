import java.util.Scanner;

public class MultiplicationTable {

    static void printTable(int n) {

        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();

        printTable(table);

        sc.close();

    }

}
