package lesson6;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printInfo();
        dog1.run(150);
        dog1.run(650);
        dog1.swim(6);
        dog1.swim(13);
        dog1.jump(0.2);
        dog1.jump(1);

        Cat cat1 = new Cat();
        cat1.printInfo();
        cat1.run(130);
        cat1.run(270);
        cat1.swim(3);
        cat1.swim(15);
        cat1.jump(1.5);
        cat1.jump(4);
        cat1.jump(-5);
    }
}