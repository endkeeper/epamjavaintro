package example;

public class Ex04 {
    public static void main(String[] args) {
        // обращение к элементам массива
        int[] a = {1, 2, 3};    
        byte i = 1;
        short i1 = 2;
        int i3 = 2;
        System.out.println(a[i]);
        System.out.println(a[i1]);
        System.out.println(a[i3]);
        
        int[] b = new int[49];
        char i4 = '0';
        b[i4] = 5;
        System.out.println(b[i4]);

        // вышли за границы массива - исключение
        try {
            int i2 = a[6];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        // пытаемся сохранить строчку в массив чисел - исключение
        try {
            Object[] t = new Integer[5];
            t[0] = "qwerty";
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        }
    }
}
