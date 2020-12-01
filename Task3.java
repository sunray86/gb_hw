package lesson2.homework;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] task3_arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i = 0;
        while (i < task3_arr.length) {
            if (task3_arr[i] < 6)
                task3_arr[i] = task3_arr[i] * 2;
            i++;
        }
        System.out.println("Task #3\n" + Arrays.toString(task3_arr));
    }
}
