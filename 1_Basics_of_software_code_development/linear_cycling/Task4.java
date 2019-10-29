/*Дано действительное натуральное число R вида nnn.ddd(три цифровых разряда
в дробно и целой частях). Поменять местами дробную и целую части числа и вывести
полученное значение числа
 */

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
