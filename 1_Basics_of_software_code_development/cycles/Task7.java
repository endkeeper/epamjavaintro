package cycles;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме едининицы
 * и самого числа. Значения m и n вводятся склавиатуры
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter m and n");
        int m = scn.nextInt();
        int n = scn.nextInt();

        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                if (i % j == 0 && i != j) {
                    System.out.println(i + " can division on " + j);
                }
            }
        }
    }
}