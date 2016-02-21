package recursion;

import java.util.Scanner;

public class RecursiaStackOverflowException {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Please enter an integer greater than one: ");
        int input = console.nextInt();

        sumReverse(input);

    }

    public static void sumReverse(int n) {
        int x = n;
        if (x >= 1) {
            System.out.print((x - 1));
            sumReverse(--x);
        }
    }
//input: 5
//result: 4 3 2 1 0
}
