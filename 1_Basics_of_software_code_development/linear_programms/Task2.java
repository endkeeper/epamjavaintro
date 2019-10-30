import java.util.Scanner;

/*
 Вычилить значение выражения по формуле (все переменные принимают действительные значения)
(b+sqrt(b^2+4ac))/(2a)-(a^3)*c + (n ^-2)
*/

public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Insert a,b,c");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int numerator = b + Math.sqrt((b ^ 2) + 4 * a * c);
        int denominator = 2*a;
        float fraction = numerator/denominator
        float result = (fraction - (a ^ 3) * c + (b ^ -2);
        System.out.printf("Result: " + "%.1f", result);
    }
}
