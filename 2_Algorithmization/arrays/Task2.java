package arrays;


import java.util.Scanner;

/*
Дана последовательность действительных чисел a1, a2, ..., an. Заменить все ее члены, большиие данного Z, этим числом,
посчитать количество замен.
 */
public class Task2 {
    public static void main(String[] args) {
        // TODO переделать через method(new float[]{1,2,3}); вызвать на нескольких наборах данных
        replace(6, 7);
    }

    private static void replace(int n, int z) {
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
