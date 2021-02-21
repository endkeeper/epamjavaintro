/*
Сортировка выбором по убыванию
 */

public class Task3 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 5, 4, 3, 8, 2, 1, 6};
        for (int elem : selectSort(array)) {
            System.out.print(elem + " ");
        }
    }

    public static int[] selectSort(int[] sort) {
        for (int i = 0; i < sort.length; i++) {
            int imax = i;
            int max = sort[i];
            for (int j = i + 1; j < sort.length; j++) {
                if (max < sort[j]) {
                    imax = j;
                    max = sort[j];
                }
            }
            sort[imax] = sort[i];
            sort[i] = max;
        }
        return sort;
    }
}
