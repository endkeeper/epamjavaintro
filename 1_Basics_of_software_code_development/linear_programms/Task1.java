import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        float a,b,c,z;
        System.out.println("Enter variables a,b,c");
        Scanner scn = new Scanner(System.in);
        a=scn.nextFloat();
        b=scn.nextFloat();
        c=scn.nextFloat();
        z=((a-3)*b/2)+c;
        System.out.println("Result: " + z);
    }
}
