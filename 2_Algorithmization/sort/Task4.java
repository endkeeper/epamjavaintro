/*
Сортировка обменами. Посчитать количество перестановок
 */

public class Task4 {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 5, 3, 2, 7, 5, 3, 2};
        for(int elem:bubbleSort(array)){
            System.out.print(elem + " ");
        }
    }

    static int[] bubbleSort(int[] sort) {
        int count = 0;
        int tmp;
        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    tmp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = tmp;
                    count++;
                }
            }
        }
        System.out.println("Number of transpositions: " + count);
        return sort;
    }
}
