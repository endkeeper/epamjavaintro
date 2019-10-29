import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Insert a,b,c");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        double Result = (b + Math.sqrt(b ^ 2 + 4 * a * c)) / (2 * a) - (a ^ 3) * c + (b ^ -2);
        System.out.printf("Result: " + "%.1f", Result);
    }
}
