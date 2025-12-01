package DataStructure.DSAPracticeQuestions;

import java.util.ArrayList;

public class ReversingEquation {

      static String reverString(String s){

        ArrayList<String> tokens = new ArrayList<>();

        int i = 0;
        int n = s.length();

        while(i < n) {
            char ch = s.charAt(i);

            if(ch >= '0' && ch <='9') {
                String num = "";

                while ( i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num + s.charAt(i);
                    i++;
                }
                tokens.add(num);
            } else {
                tokens.add(Character.toString(ch));
                i++;
            }
        }

        String result = "";

        for(int j = tokens.size()-1; j>=0; j--) {
            result = result + tokens.get(j);
        }
        return result;
    }

    public static void main(String[] args) {

        String s = "20-3+5*2";
        System.out.println("The reversed equation is: ");
        System.out.println(reverString(s));

    }
}
