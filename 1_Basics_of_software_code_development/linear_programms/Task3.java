//вычислить значение выражения по формуле
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        float x,y;
        double result;
        System.out.println("Enter variables x,y");
        Scanner scn = new Scanner(System.in);
        x=scn.nextFloat();
        y=scn.nextFloat();
        result = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.println("Result: " + result);
    }
}
