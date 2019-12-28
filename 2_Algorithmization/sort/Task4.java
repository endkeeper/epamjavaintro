package sort;

/*
Сортировка обменами. Отсортировать по возрастанию последовательность a1<=a2<=n
 */

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args){
        sort(new int[]{1,3,5,7,9,12,16,23});
        sort(new int[]{43, 1, 4, 5, 8});
        sort(new int[]{3, 6, 16, 13, 16});
        sort(new int[]{10, 21, 54, 54, 123, 432});
        sort(new int[]{21, 10, 432, 54, -5, 123});
    }

    // todo сделать отступы, отформатировать вывод, посчитать количество перестановок
    private static void sort(int[] arr){
        System.out.println("Before: ");
        System.out.print(Arrays.toString(arr));
        int length = arr.length;
        for(int i=0; i<length; i++ ){
            for(int j=0; j<length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print(Arrays.toString(arr));
    }
}
