package arrays;

/*
Даны целые числа a1, a2,..., an. Вывести на печать только те числа, для которых ai>i.
 */

public class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 6, 3, 2, 1};
        numbers(arr);
    }

    private static void numbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
