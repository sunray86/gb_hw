package lesson2.homework;

public class Task6 {
    public static void main(String[] args) {
        int[] task6_arr = {1, 1, 1, 2, 1};
        System.out.println("Task #6\n" + checkBalance(task6_arr));
    }

    public static boolean checkBalance(int[] arr) {
        int i = 0;
        boolean balance = false;

        while (i < arr.length - 1) {
            int left_sum = 0;
            int right_sum = 0;

            for (int j = 0; j < arr.length; j++) {
                if (j <= i)
                    left_sum += arr[j];
                else
                    right_sum += arr[j];
            }

            if (left_sum == right_sum) {
                balance = true;
                break;
            }
            i++;
        }

        return balance;
    }
}
