package arrays;

/*
Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент(освободившиеся
элементы заполнить нулями). Примичание. Дополнительн массив не использовать
 */

public class Task10 {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,4,6,3,2,1,6};
        int[] arr1 = new int[]{6,3,-1,4,55,23,0,21,3};
        int[] arr2 = new int[]{-14,43,52,1,-2,12,-43};
        newArr(arr);
        newArr(arr1);
        newArr(arr2);
    }

    static void newArr(int[] x){
        for (int i=0; i<x.length; i++){
            if (i%2!=0){
                x[i]=0;
            }
        }

        for (int c : x){
            System.out.print(c+ " ");
        }
        System.out.println();
    }
}
