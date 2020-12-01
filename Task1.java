package lesson2.homework;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] task1_arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < task1_arr.length; i++) {
            if (task1_arr[i] == 0)
                task1_arr[i] = 1;
            else
                task1_arr[i] = 0;
        }
        System.out.println("Task #1\n" + Arrays.toString(task1_arr));
    }
}
