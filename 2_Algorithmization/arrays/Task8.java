package arrays;

/*
Дана последовательность целых чисел a1,a2,...,an. Обзразовать новую последовательность, выбросив из исходной те члены,
которые равны min(a1,a2,...,an)
 */

public class Task8 {
    public static void main(String[] args) {
        min(new int[]{12, 43, 1, 3, 5, 1, 5, 2, 3, 1, 4, 3});
        min(new int[]{9, 8, 7, 6, 5, 4});
        min(new int[]{15, -3, 4, 1, -3, 6, 3, 2, 4});
    }

    // todo пересмотреть алгоритм в целом
    private static void min(int[] x) {
        int min = x[0];
        int nmin = 0;
        for (int i = 1; i < x.length; i++) {
            if (min >= x[i]) {
                min = x[i];
            }
        }
        for (int i = 1; i < x.length; i++) {
            if (x[i] == min) {
                nmin++;
            }
        }
        int[] newArr = new int[x.length - nmin];
        int n = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == min) {
                n++;
            } else {
                newArr[i - n] = x[i];
            }
        }
        for (int m : newArr) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}
