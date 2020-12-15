package lesson6;

public class Dog extends Animal {

    public Dog() {
        super();
        this.maxRunDistance = 400 + random.nextInt(201);
        this.maxSwimDistance = 8 + random.nextInt(5);
        this.maxJumpHeight = 0.4 + (random.nextInt(3) / 10.0);
    }

}