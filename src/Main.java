public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 1.5 Массивы часть 1");
        // Задача 1 + 2
        System.out.println("Задание 1 + 2");
        int [] weight = new int[12];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;
        System.out.print(weight[0] + ", " + weight[1] + ", " + weight[2]);
        System.out.println();

        double [] weightDouble = new double [] {1.57, 7.654, 9.986};
        System.out.print(weightDouble[0] + ", " + weightDouble[1] + ", " + weightDouble[2]);
        System.out.println();

        long [] weightLong = new long[12];
        weightLong [0] = weight [0];
        weightLong [1] = 7_654_777;
        weightLong [5] = 12_567_341;
        System.out.print(weightLong[0] + ", " + weightLong[1] + ", " + weightLong[5]);
        System.out.println();
        System.out.println("Задание 3");


    }
}