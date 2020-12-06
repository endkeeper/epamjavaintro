//Вычислить значение функции

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x;
        double result;
        System.out.println("Enter x");
        x = scn.nextInt();
        if (x >= 3) {
            result = x * x - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("result: " + result);
    }
}
