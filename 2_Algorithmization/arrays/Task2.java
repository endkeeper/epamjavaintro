package arrays;

/*
Дана последовательность действительных чисел a1, a2, ..., an. Заменить все ее члены, большиие данного Z, этим числом,
посчитать количество замен.
 */
public class Task2 {
    public static void main(String[] args) {
        float z = 6f;
        replace(new float[]{1f, 43f, 3f, -1f, 573f}, z);
        replace(new float[]{-7f, -23f, -57f, 0f, 3f}, z);
        replace(new float[]{9f, 11f, 65f, -55f, -423f}, z);
    }

    private static void replace(float[] x, float z) {
        int replaces = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > z) {
                x[i] = z;
                replaces++;
            }
        }
        for (float i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Numbers of replaces is - " + replaces);
    }
}
