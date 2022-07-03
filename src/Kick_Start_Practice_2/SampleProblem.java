package Kick_Start_Practice_2;


import java.util.Scanner;

public class SampleProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tests = input.nextInt();

        for (int i = 1; i<= tests; i++){
            int total = 0;

            int bags = input.nextInt();
            int kids = input.nextInt();

            int[] pieces = new int[bags];
            for (int e : pieces) {
                e = input.nextInt();
                total += e;
            }

            int remainder = total % kids;
            System.out.println("Case #"+i+": "+remainder);
        }
    }
}
