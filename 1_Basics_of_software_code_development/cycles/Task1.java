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
        int result = 0;
        while (number < 0) {
            System.out.println("Enter number again. Number>0");
            number = scn.nextInt();
        }
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println("Result: " + result);
    }
}