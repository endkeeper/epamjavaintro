//Найти сумму квадратов первых ста чисел

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            int a = i ^ 2;
            sum += a;
            System.out.println("result:  " + sum);
        }
    }
}
