package lesson6;

public class Cat extends Animal {

    public Cat() {
        super();
        this.maxRunDistance = 150 + random.nextInt(101);
        this.maxSwimDistance = 0;
        this.maxJumpHeight = 1.5 + (random.nextInt(11) / 10.0);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать!");
    }

    @Override
    protected void printInfo() {
        System.out.printf("Максимальная дистанция бега: %d; Коты не умеют плавать!; Максимальная высота прыжка: %.1f%n", this.maxRunDistance, this.maxJumpHeight);
    }
}
