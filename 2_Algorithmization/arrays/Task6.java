package arrays;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядкове номера которых являются простыми числами
 */

// todo пересмотреть эту задачу в будущем с оптимизациями
public class Task6 {
    public static void main(String[] args) {
        sum(new float[]{2f, 1f, 21f, 5f, 3f, 1f, 2f, 5f, 6f});
        sum(new float[]{5f, -10f, 4f, 42f, 13f, 5f});
        sum(new float[]{26f, 42f, 21f, 1f, -43f, -10f, 0});
    }

    private static void sum(float[] x) {
        float sum = x[2];
        first:
        for (int i = 3; i < x.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue first;
                }
            }
            sum += x[i];
        }
        System.out.println(sum);
    }
}

