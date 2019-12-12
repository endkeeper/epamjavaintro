/**
 * Заданы размеры отверстия a,b и размеры кирпича x,y,z. Определить, пройдет ли кирпич в
 * отверстие
 */

public class Task4 {
    public static void main(String[] args) {
        brick(5, 2, 1, 2, 3);
    }

    private static void brick(int a, int b, int x, int y, int z) {
        boolean pos1 = a > x && b > y;
        boolean pos2 = a > z && b > y;
        boolean pos3 = a > y && b > x;

        if (pos1 || pos2 || pos3) {
            System.out.println("Brick can go through hole");
        } else {
            System.out.println("Brick cant go through hole");
        }
    }
}
