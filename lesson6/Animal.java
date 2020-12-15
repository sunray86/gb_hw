package lesson6;

import java.util.Random;

public class Animal {

    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected double maxJumpHeight;

    Random random = new Random();

    protected void run(int distance) {
        if (distance < 0) {
            System.out.println("Введите положительно число!");
        } else {
            boolean compareDistance =  distance <= this.maxRunDistance;
            System.out.printf("run distance = %d result: %b%n", distance, compareDistance);
        }
    }

    protected void swim(int distance) {
        if (distance < 0) {
            System.out.println("Введите положительно число!");
        } else {
            boolean compareDistance =  distance <= this.maxSwimDistance;
            System.out.printf("swim distance = %d result: %b%n", distance, compareDistance);
        }
    }

    protected void jump(double height) {
        if (height < 0) {
            System.out.println("Введите положительно число!");
        } else {
            boolean compareDistance =  height <= this.maxJumpHeight;
            System.out.printf("jump distance = %.1f result: %b%n", height, compareDistance);
        }
    }

    protected void printInfo() {
        System.out.printf("Максимальная дистанция бега: %d; Максимальная дистанция заплыва: %d; Максимальная высота прыжка: %.1f%n", this.maxRunDistance, this.maxSwimDistance, this.maxJumpHeight);
    }
}
