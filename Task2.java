package lesson2.homework;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        final int TASK2_ARR_SIZE = 8;
        int[] task2_arr = new int[TASK2_ARR_SIZE];
        for (int i = 0; i < task2_arr.length; i++) {
            task2_arr[i] = i * 3;
        }
        System.out.println("Task #2\n" + Arrays.toString(task2_arr));
    }
}
