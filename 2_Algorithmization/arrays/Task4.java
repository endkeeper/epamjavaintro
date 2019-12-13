package arrays;

import java.util.Arrays;

/*
Даны действительные числа a1,a2,..., an. Поменять местами наибольший и нименьший элементы.
 */

public class Task4 {
    public static void main(String[] args) {
        replace(new float[]{1f, 43f, 12f, -31f, 4f, 13f});
        replace(new float[]{0f, 15f, -43f, -1f, 75f, 123f});
        replace(new float[]{4f, 42f, 13f, -142f, 752f, 17f});
    }

    private static void replace(float[] x) {
        float max = x[0];
        float min = x[0];
        int maxi = 0;
        int mini = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
                mini = i;
            }
            if (x[i] > max) {
                max = x[i];
                maxi = i;
            }
        }
        x[maxi] = min;
        x[mini] = max;
        System.out.println(Arrays.toString(x));
    }
}