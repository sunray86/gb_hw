package lesson7.oop;

import java.util.Random;

public class Cat {

    private String name;

    private Random random = new Random();

    private int maxFood;

    private boolean satiety = false;

    public Cat(int i) {
        this.name = "cat"+i;
        this.maxFood = 8 + random.nextInt(5);;
    }

    public void eat(Plate plate, int i) {
        if (plate.decreaseFood(maxFood)) {
            satiety = true;
            System.out.println("Котик " + i + " съел " + maxFood +" единиц еды и теперь он наелся и спит! Сытость = " + String.valueOf(satiety));
        } else {
            satiety = false;
            System.out.println("Коту №" + i + " не хватило еды (он кушает " + maxFood + " единиц еды). Сытость = " + String.valueOf(satiety));
        }
    }
}
