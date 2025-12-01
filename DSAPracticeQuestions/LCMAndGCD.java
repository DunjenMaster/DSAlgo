package DataStructure.DSAPracticeQuestions;

public class LCMAndGCD {

    public static int[] lcmAndGCDCheck(int a, int b) {

        //GCD
        //Edge case -> check if both lcm and gcd is 1, then return {1,1}
        if(a == 1 && b == 1) {
            return new int[]{1,1};
        }

        int gcd = 1; // Initialize GCD to 1

        //check which of the given two number is smaller, why? because gcd can not be larger than the smaller number
        int smaller;
        if(a < b)
            smaller = a;
        else
            smaller = b;

        for(int i = smaller ; i>=1; i--){
            if(a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }

        //==================================================================================

        //Lcm
        int lcm;

        //check which of the given two number is larger, why? because lcm can not be smaller than the larger number
        int larger;
        if(a>b)
            larger = a;
        else
            larger = b;

        while(true) {
            if(larger % a == 0 && larger % b == 0) {
                lcm = larger;
                break;
            }
            larger++;
        }

        return new int[]{lcm,gcd};
    }

    public static void main(String[] args){
        int[] ans1 = lcmAndGCDCheck(14,8);
        System.out.println("LCM: " + ans1[0] + ", GCD: " + ans1[1]);

        int[] ans2 = lcmAndGCDCheck(5,10);
        System.out.println("LCM: " + ans2[0] + ", GCD: " + ans2[1]);
    }
}
