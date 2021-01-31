/*
Сделать магический квадрат
 */

public class Task16 {
    public static void main(String[] args) {
        square(7);
    }

    static void square(int n) {
        int[][] arr = new int[n][n];
        int length = (int) Math.pow(n, 2) - 1;
        int[] pull = new int[length];
        for (int i = 2, k = 0; i < length + 2; i++, k++) {
            pull[k] = i;
        }
        int index = 0;
        arr[0][n / 2] = 1;
        int pos1 = 0;
        int pos2 = n / 2;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.println(pos1 + " " + pos2);
                pos1 -= 1;
                if (pos1 < 0) {
                    pos1 = n - 1;
                }
                pos2 += 1;
                if (pos2 == n) {
                    pos2 = 0;
                }
                if (arr[pos1][pos2] != 0) {
                    pos1 += 2;
                    pos2 -= 1;
                    if (pos1 == n) {
                        pos1 = 0;
                    } else if (pos1 == n + 1) {
                        pos1 = 1;
                    }
                    if (pos2 < 0) {
                        pos2 = n - 1;
                    }
                    arr[pos1][pos2] = pull[index];
                    index++;
                } else {
                    arr[pos1][pos2] = pull[index];
                    index++;
                }
                if (index == pull.length) {
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "       ");
            }
            System.out.println();
        }

    }
}
