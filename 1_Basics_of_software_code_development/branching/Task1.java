/**
 * Даны два угла треугольника. Определить, сущетсвует ли такой треугольник и если да,
 * является ли он прямоугольным
 */

public class Task1 {
    public static void main(String[] args) {
        triangle(45, 45);
    }

    static void triangle(int x, int y) {
        int sum = x + y;
        if (sum >= 180) {
            System.out.println("triangle is not exist");
        } else if (sum == 90) {
            System.out.println("triangle is right-angled");
        } else {
            System.out.println("triangle is exist");
        }
    }
}
