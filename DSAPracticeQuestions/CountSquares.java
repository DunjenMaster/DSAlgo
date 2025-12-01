package DataStructure.DSAPracticeQuestions;

public class CountSquares {

    static int countSquare(int n){
        int count = 0;
        for(int i =1; i*i<n; i++){
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println("The number of perfect squares less than n are: ");
        System.out.println(countSquare(9));
    }
}
