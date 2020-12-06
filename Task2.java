package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        String product = "";

        while (true) {
            System.out.println("Угадайтие название продукта");
            product = in.next();
            if (word.equals(product)) {
                break;
            } else {
                ReturnMask(product, word);
            }
        }

        System.out.printf("Вы угадали! Правильное слово:%n%s", word);
    }

    public static String ReturnMask(String product, String word) {
        String newStatus = "";
        for (int i = 0; i < 15; i++) {
            if (i < word.length() & i < product.length()) {
                if (product.charAt(i) == word.charAt(i)) {
                    newStatus += word.charAt(i);
                } else {
                    newStatus += '#';
                }
            } else {
                newStatus += '#';
            }
        }

        System.out.println(newStatus);
        return newStatus;
    }
}

