package branching;

import java.util.Scanner;

/**
 * Найти max[{min(a,b), mic(c,d)}
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numbers a,b,c,d");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int min1;
        int min2;

        if (a > b) {
            min1 = b;
        } else {
            min1 = a;
        }

        if (c > d) {
            min2 = d;
        } else {
            min2 = c;
        }

        if (min1 > min2) {
            System.out.println("Max: " + min1);
        } else {
            System.out.println("Max: " + min2);
        }
    }
}