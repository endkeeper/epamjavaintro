//Составить программу нахождения произведенеия квадратов первых двухсот чисел

class Task4 {
    public static void main(String[] args) {
        long mult = 1;
        for (int i = 1; i <= 200; i++) {
            mult *= Math.pow(i, 2);
        }
        System.out.println("result: " + mult);
    }
}
