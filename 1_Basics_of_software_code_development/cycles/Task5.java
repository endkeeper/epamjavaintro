//Даны числовой ряд и некоторое число е. Найти сумму тех челнов ряда, модуль которых больше или равен заданному е.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter e");
        float e = scn.nextFloat();
        int n = 1;
        double series = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
        float sum = 0;
        while (Math.abs(series) >= e) {
            series = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            sum += series;
            n++;
        }
        System.out.println("result:  " + sum);
    }
}
