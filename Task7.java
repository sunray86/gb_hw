package lesson2.homework;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int n = -12;
        System.out.printf("n = %d%n",n);

        //Простой способ с доп массивом
        lowSkillWithNewArr(arr, n);

        //Не очень умный(производительный) способ, но зато без доп массива
        lowPerformanceMethod(arr, n);
    }

    public static void lowSkillWithNewArr(int[] arr, int n) {
        int[] arr_new = new int[arr.length];
        int new_index = 0;
        n = n % arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (n == 0) {
                arr_new = arr;
                break;
            } else if (n > 0) {
                new_index = (i + n) % arr.length;
            } else {
                new_index = (arr.length + n + i) % arr.length;
            }
            arr_new[new_index] = arr[i];
        }
        System.out.printf("#1 Простой способ с доп. массивом\n%s", Arrays.toString(arr_new));
    }

    private static void lowPerformanceMethod(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Массив не изменился\n" + Arrays.toString(arr));
        } else if (n > 0) {
            n = n % arr.length;
            for (int i = 0; i < n; i++){
                int keep_element = arr[arr.length-1];
                for (int j = arr.length-1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = keep_element;
            }
        } else {
            n = n % arr.length;
            for (int i = 0; i > n; i--){
                int keep_element = arr[0];
                for (int j = 1; j < arr.length; j++) {
                    arr[j-1] = arr[j];
                }
                arr[arr.length-1] = keep_element;
            }
        }
        System.out.println("\n#2 Не очень умный(не производительный) способ, но зато без доп массива\n" + Arrays.toString(arr));
    }
}
