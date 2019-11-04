package cycles;

/**
 * Дан числовой ряд и некоторое число e. Найдите сумму тех членов ряда, модуль которых больше или равен
 * заданному e.  Общий член ряда имеет вид (1 / Math.pow(2, n)) + (1 / Math.pow(3, n)).
 */

public class Task5 {
    public static void main(String[] args) {
        pos(0.01);
        pos(0.1);
    }

    static void pos(double e) {
        double sum = 0;
        int n = 1;
        boolean check = true;
        while (check == true) {
            double an = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            if (Math.abs(an) >= e) {
                sum += an;
            } else {
                check = false;
            }
            n++;
        }
        System.out.println(sum);
        System.out.println();
    }
}