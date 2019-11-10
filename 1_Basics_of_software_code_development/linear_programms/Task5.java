package linear_programms;

import java.util.Scanner;

/**
 * Дано натуральное число T, которое представляет длительность прошедшего
 * времени в секунднах. Вывести данное знаение длительности в часах, минутах
 * и секундах в следующей форме HHч MMмин SSс
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Insert some number");
        int x = scn.nextInt();
        int h = x / 3600;
        int m = x / 60;
        if (m > 60) {
            m = m % 60;
        }
        if (m == 60) {
            m = 0;
        }
        int s = x % 60;
        System.out.println(h + "h " + m + "m " + s + "s");
    }
}