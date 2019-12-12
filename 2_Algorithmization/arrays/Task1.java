package arrays;

/*
В массиве A[n] занесены натуральные числа. Найти суммы тех элементов, которые кратн данному k
 */

public class Task1 {
    public static void main(String[] args) {
        // TODO переделать через method(new int[]{1,2,3}); вызвать на нескольких наборах данных
        int k = 6;
        sum(new int[]{1, 5, 4, 3, 2, 7, 5, 4}, k);
        sum(new int[]{1, 5, 4, 6, 2, 7, 5, -6, 6}, k);
        sum(new int[]{1, 5, 6, 3, 2, 12, 5, 4}, k);
    }

    private static void sum(int[] x, int k) {
        int result = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % k == 0) {
                result += x[i];
            }
        }
        System.out.println(result);
    }
}
