/*
Даны целые числа. Вывести только те числа, для которых arr[i]>i.
 */

public class Task25 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 6, 3, 7, 8, 1, 3, 6, 3, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.print(arr[i] + "  ");
            }
        }
    }
}
