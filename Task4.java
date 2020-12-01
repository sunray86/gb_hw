package lesson2.homework;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Task #4");
        final int TASK4_ARR_SIZE = 7;
        int[][] task4_arr = new int[TASK4_ARR_SIZE][TASK4_ARR_SIZE];

        for (int i = 0; i < task4_arr.length; i++) {
            for (int j = 0; j < task4_arr[i].length; j++) {
                if ((i == j) || (i + j == TASK4_ARR_SIZE - 1))
                    task4_arr[i][j] = 1;
                else
                    task4_arr[i][j] = 0;
                System.out.printf("%2s", task4_arr[i][j]);
            }
            System.out.println();
        }
    }
}
