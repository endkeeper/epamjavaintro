/*
Дан целочисленный массив с количеством элементов n.  Сжать массив, выбросив из него каждый второй элемент
(освободившиеся элементы заменить нулями). Доп. массив не использовать.
 */

public class Task210 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 4, 5, 3, 1, 5, 6, 9, 8, 4};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        for (int i = 1, index = 2; index < arr.length; i++, index += 2) {
            arr[i] = arr[index];
            arr[index] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
