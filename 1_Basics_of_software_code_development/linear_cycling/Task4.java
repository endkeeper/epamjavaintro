import java.util.Scanner;

public class Task4   {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Insert number format xxx,yyy");
        String xxx = scn.nextLine();
        String yyy = scn.nextLine();
        float number = Float.parseFloat(yyy + "." + xxx);
        System.out.println(number);
    }
}
