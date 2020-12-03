package lesson3;

import java.util.Scanner;

public class Task1 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        CheckIn();
        while (true) {
            System.out.println("Хотите сыграть еще раз? 1 - Да, 0 - Нет");
            String str = in.next();
            str = str.toLowerCase();
//            if (str == "y" || str == "yes" || str ==  "да" || str ==  "1" || str ==  "+") {
//                System.out.println("Новая игра!");
//                CheckIn();
//            } else if (str == "0" || str == "n" || str == "no" || str == "нет"){
//                System.out.println("Всего доброго!");
//                break;
//            } else {
//            }
            switch (str) {
                case "y", "yes", "да", "1", "+":
                    System.out.println("Новая игра!");
                    CheckIn();
                    continue;
                case "0", "n", "no", "нет":
                    System.out.println("Всего доброго!");
                    System.exit(0);
                default:
            }
        }

    }

    public static void CheckIn() {
        int random = (int)(Math.random()*10);
        int i = 0;
        while (i < 3) {
            System.out.println("Введите число от 0 до 9:");
            if (in.hasNextInt()) {
                int number = in.nextInt();
                if (number > random) {
                    System.out.println("Загаданное число меньше");
                } else if (number < random) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Поздравляем! Вы угадали!");
                    break;
                }
            } else {
                System.out.println("Вы должны ввести число");
                in.next();
            }
            System.out.printf("Осталось попыток: %d%n", 2-i);
            i++;
            if (i == 3) {
                System.out.println("Вы проиграли :(");
            }
        }
    }
}
