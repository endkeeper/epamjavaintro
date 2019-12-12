/**
 * Заданы три точки. Определить, расположены ли они на одной прямой
 */

public class Task3 {
    public static void main(String[] args) {
        points(1, 2, 1, 3, 1, 5);
    }

    private static void points(int x1, int y1, int x2, int y2, int x3, int y3) {
        int statement1 = (x1 - x2) * (y3 - y2);
        int statement2 = (x3 - x2) * (y1 - y2);
        if (statement1 == statement2) {
            System.out.println("points on same lines");
        } else {
            System.out.println("points on different lines");
        }
    }
}
