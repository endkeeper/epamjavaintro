package arrays;

/*
Дана последовательность действительных чисел a1, a2, ..., an. Заменить все ее члены, большиие данного Z, этим числом,
посчитать количество замен.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        replace(6, 7);
    }

    static void replace(int n, int z) {
        float[] arr = new float[n];
        int replaces = 0;
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextFloat();
            if (arr[i] > z) {
                arr[i] = z;
                replaces++;
            }
        }
        for (float i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("Numbers of replaces is - " + replaces);
    }
}
