package arrays;

/*
Даны целые числа a1, a2,..., an. Вывести на печать только те числа, для которых ai>i.
 */

public class Task5 {
    public static void main(String[] args) {
        numbers(new int[]{4, 1, 6, 3, 2, 1});
        numbers(new int[]{-5, 2, 1, 6, 14, 3});
        numbers(new int[]{15, 4, 8, 1, 3, 2, -10});
    }

    private static void numbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
