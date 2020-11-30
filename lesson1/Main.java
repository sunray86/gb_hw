package lesson1;

//Task #1
public class Main {

    public static void main(String[] args) {
        //Task #2
        byte varByte = 1;
        short varShort = 8;
        int varInt = 800;
        long varLong = 80_000L;
        float varFloat = 0.1f;
        double varDouble = 1.5;
        char varChar = 'H';
        boolean varBool = true;

        //Task #3
        double task3 = calculate_task3(4, 5, 8, 19);
        System.out.println("Task #3 Result: " + task3);

        //Task #4
        int task4_varA = 11;
        int task4_varB = 9;
        boolean task4;
        task4 = check_task4(task4_varA, task4_varB);
        System.out.println("Task #4 Sum of numbers task4_varA = " + task4_varA + " and task4_varB = " + task4_varB + " between 10 and 20: " + task4);

        //Task #5
        task5_isPositive(17);

        //Task #6
        boolean task6;
        int task6_number = -15;
        task6 = task6_isNegative(task6_number);
        System.out.println("Task #6 The number " + task6_number + " is negative: " + task6);

        //Task #7
        task7_helloName("Ильнур");
    }

    //Task #3 method
    public static double calculate_task3(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    //Task #4 method
    public static boolean check_task4(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    //Task #5 method
    public static void task5_isPositive(int a) {
        if (a >= 0) {
            System.out.println("Task #5 The number " + a + " is positive");
        } else {
            System.out.println("Task #5 The number " + a + "is negative");
        }
    }

    //Task #6 method
    private static boolean task6_isNegative(int a) {
        return (a < 0);
    }

    //Task #7 method
    private static void task7_helloName(String name) {
        System.out.println("Task #7 Привет, " + name + "!");
    }
}
