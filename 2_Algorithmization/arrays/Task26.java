/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */
public class Task26 {
    public static void main(String[] args) {
        double[] arr = new double[]{4.1, 4.3, 1.4534, 123.54, 43.12, 7.4, 76.2, 12.3};
        double sum = arr[2];
        for (int i = 3; i < arr.length; i++) {
            boolean check = false;
            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                sum += arr[i];
            }
        }
        System.out.print("Result: " + sum);
    }
}
