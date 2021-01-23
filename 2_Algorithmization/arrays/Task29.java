/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то
определить наименьшее их них
 */

public class Task29 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 4, 5, 6, 7, 3, 1, 4, 7, 1, 6, 6, 2};
        int min = arr[0];
        int count = 0;
        int countTmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > countTmp) {
                min = arr[i];
            }
            if (min >= arr[i]) {
                min = arr[i];
            }
            countTmp = count;
            count = 0;
        }
        System.out.print("Result: " + min);
    }
}
