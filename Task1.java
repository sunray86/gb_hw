package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static Scanner in = new Scanner(System.in);
    public static Random random = new Random();
    public static char[][] map;
    public static final int SIZE = 7;
    public static final int DOTS_TO_WIN = 5;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humansTurn();
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            pcTurn();
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("☑ ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void humansTurn() {
        int x, y;
        do {
            x = 0;
            y = 0;

            while (true) {
                System.out.println("Введите строку");
                if (in.hasNextInt()) {
                    x = in.nextInt() - 1;
                } else {
                    in.next();
                    System.out.printf("Вводите числа в диапазоне от 0 до %d!%n", SIZE);
                    continue;
                }

                System.out.println("Введите столбец");
                if (in.hasNextInt()) {
                    y = in.nextInt() - 1;
                    break;
                } else {
                    in.next();
                    System.out.printf("Вводите числа в диапазоне от 0 до %d!%n", SIZE);
                }
            }
        } while (!isCellValid(x, y));

        map[x][y] = DOT_X;

        if (checkWin(map, DOT_X, x, y)) {
            System.out.println("Вы победили!");
            printMap();
            System.exit(0);
        }
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean isCellValid(int x, int y) {

        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            System.out.printf("Введите число в диапазоне от 0 до %d%n", SIZE);
            return false;
        }

        if (map[x][y] == DOT_EMPTY) {
            return true;
        } else {
            System.out.println("Выберите свободную ячейку!");
        }

        return false;
    }

    public static void pcTurn() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
//        Проработка блокировки хода игрока
//        } while (!isCellValid(x, y) && !blockAvailable(map, x, y));

        map[x][y] = DOT_O;
        System.out.printf("Компьютер сходил в точку x = %d y = %d%n", x + 1, y + 1);

        if (checkWin(map, DOT_O, x, y)) {
            System.out.println("Машины победили! >:)");
            printMap();
            System.exit(0);
        }

        printMap();
    }

//    Проработка блокировки хода игрока
//    private static boolean blockAvailable(char[][] map, int x, int y) {
//        diagonalLeftBlockCheck(map, x, y);
//        return false;
//    }
//
//    public static boolean diagonalLeftBlockCheck(char[][] map, int x, int y) {
//        int counter = 1;
//        for (int i = 0; x < )
//
//        return counter == DOTS_TO_WIN;
//    }


    public static boolean checkWin(char[][] map, char dot, int x, int y) {
        if (diagonalLeftCheck(map, dot, x, y) || diagonalRightCheck(map, dot, x, y) || verticalCheck(map, dot, x, y) || horizontalCheck(map, dot, x, y)) {
            return true;
        }
        return false;
    }

    public static boolean diagonalLeftCheck(char[][] map, char dot, int x, int y) {
        int counter = 1;
        while (x != 0 && y != 0) {
            if (map[x - 1][y - 1] == dot) {
                x -= 1;
                y -= 1;
            } else {
                break;
            }
        }

        while (x + 1 < SIZE && y + 1 < SIZE && map[x + 1][y + 1] == dot) {
            counter++;
            x++;
            y++;
        }

        return counter == DOTS_TO_WIN;
    }

    public static boolean diagonalRightCheck(char[][] map, char dot, int x, int y) {
        int counter = 1;
        while (x != 0 && y + 1 < SIZE) {
            if (map[x - 1][y + 1] == dot) {
                x -= 1;
                y += 1;
            } else {
                break;
            }
        }

        while (x + 1 < SIZE && y != 0 && map[x + 1][y - 1] == dot) {
            counter++;
            x++;
            y--;
        }

        return counter == DOTS_TO_WIN;
    }

    public static boolean horizontalCheck(char[][] map, char dot, int x, int y) {
        int counter = 1;
        while (y != 0) {
            if (map[x][y - 1] == dot) {
                y -= 1;
            } else {
                break;
            }
        }

        while (y + 1 < SIZE && map[x][y + 1] == dot) {
            counter++;
            y++;
        }

        return counter == DOTS_TO_WIN;
    }

    public static boolean verticalCheck(char[][] map, char dot, int x, int y) {
        int counter = 1;
        while (x != 0) {
            if (map[x - 1][y] == dot) {
                x -= 1;
            } else {
                break;
            }
        }

        while (x + 1 < SIZE && map[x + 1][y] == dot) {
            counter++;
            x++;
        }

        return counter == DOTS_TO_WIN;
    }
}