package lesson2.homework;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] task5_arr = {1, 5, 12, 53, 233, 14, -2};
        Arrays.sort(task5_arr);
        System.out.println("Task #5\nMax = " + task5_arr[task5_arr.length - 1] + "\nMin = " + task5_arr[0]);
    }
}
