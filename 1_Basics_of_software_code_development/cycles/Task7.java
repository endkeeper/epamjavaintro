/*
Для каждого натурального числа в промежутке от n до m вывести все делители кроме единицы и самого
числа. Значения ввести с клавиатуры.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m, n;
        System.out.println("Enter m and n");
        m = scn.nextInt();
        n = scn.nextInt();
        division(m, n);
    }

    static void division(int m, int n) {
        int mod;
        for (int i = m; i < n; i++) {
            for (int j = 2; j < i; j++) {
                mod = i % j;
                if (mod == 0) {
                    System.out.println("Number " + i + " can division on " + j);
                }
            }
        }
    }
}
