package DataStructure.DSAPracticeQuestions;

import java.util.ArrayList;

public class MultiplicationTable {

    static ArrayList<Integer>  multiplicationTable(int n) {
        ArrayList<Integer> table = new ArrayList<>();
        for(int i = 1; i<=10 ; i++){
            table.add(n * i);
        }
        return table;
    }

    public static void main(String[] args) {

        System.out.println("The multiplication table is: ");
        System.out.println(multiplicationTable(6));

    }
}
