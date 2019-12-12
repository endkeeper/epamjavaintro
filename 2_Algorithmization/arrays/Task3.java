package arrays;

/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых
элементов
 */

public class Task3 {
    public static void main(String[] args) {
        // TODO переделать через method(new float[]{1,2,3}); вызвать на нескольких наборах данных
        array(new float[]{3f, 5f, 52f, -43f, 13f, 0f});
        array(new float[]{43f, -5f, -52f, 0f, 3f, 0f});
        array(new float[]{41f, 0f, 0f, -47f, 7f, 0f});
    }

    static void array(float[] x) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                pos++;
            } else if (x[i] == 0) {
                zero++;
            } else {
                neg++;
            }
        }
        System.out.println("positive numbers " + pos + " negative numbers " + neg + " zero numbers " + zero);
    }

}