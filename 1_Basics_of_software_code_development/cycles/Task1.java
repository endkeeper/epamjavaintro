package cycles;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scn.nextInt();
        boolean flag = false;
        if (number > 0) {
            flag = true;
        } else {
            System.out.println("Incorrect number. Number > 0");
        }
        int result = 0;

        while (flag == true) {
            for (int i = 0; i <= number; i++) {
                result += i;
                if (i == number) {
                    flag = false;
                }
            }
            System.out.println("Result: " + result);
        }
    }
}
