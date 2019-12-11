package arrays;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько,
то определить наименьшее из них
 */

public class Task9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 54, 3, 4, 6, 1, 9, 4, 9, 1, 9, 9, 1, 9,};
        numbers(arr);
    }

    static void numbers(int[] x) {
        int n = 0;
        int repeats[] = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[i] == x[j]) {
                    n++;
                }
            }
            repeats[i] = n;
            n = 0;
        }
        int maxi = 0;
        for (int i = 0; i < repeats.length - 1; i++) {
            if (repeats[i] <= repeats[i + 1]) {
                if (x[i] >= x[i + 1]) {
                    maxi = i + 1;
                }
            }
        }
        System.out.println(x[maxi]);
    }
}
