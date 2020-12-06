//Написать программу, где пользователь вводт любое положительное число, а программа суммирует все числа от 1 до заданного числа

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number");
        int x;
        x = scn.nextInt();
        int result;
        result = cycle(x);
        System.out.println("result: " + result);
    }

    static int cycle(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            sum += i;
        }
        return sum;
    }
}
