/*
Сортировка вставками. Место помещения очередного элемента в отсортированную часть производить с помощью
двоичного поиска
 */

public class Task5 {
    public static void main(String[] args) {
        int[] array = {5, 6, 5, 3, 2, 0, 5, 4, 3, 2, 1, 6, 7, 8};
        for (int elem : insertionSort(array)) {
            System.out.print(elem + " ");
        }
    }

    static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int value = array[i];
            int index = bSearch(array, 0, j, value);
            while (index <= j) {
                array[j + 1] = array[j];
                j--;
            }
            array[index] = value;
        }
        return array;
    }

    static int bSearch(int[] array, int first, int last, int value) {
        int middle = 0;
        if (value < array[first]) {
            return first;
        }
        if (value > array[last]) {
            return last + 1;
        }
        while (first <= last) {
            middle = (first + last) / 2;
            if (array[middle] <= value && value <= array[middle + 1]) {
                return middle + 1;
            }
            if (value < array[middle]) {
                last = middle - 1;
            }
            if (value > array[middle]) {
                first = middle + 1;
            }
        }
        return middle;
    }
}



