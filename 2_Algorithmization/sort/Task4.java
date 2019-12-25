package sort;

/*
Сортировка обменами. Отсортировать по возрастанию последовательность a1<=a2<=n
 */

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args){
        sort(new int[]{1,3,5,7,9,12,16,23});
    }

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
