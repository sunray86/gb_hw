package lesson7.oop;

public class Plate {

    private int food;

    public void addFood(int food) {
        this.food += food;
    }

    public boolean decreaseFood(int food) {
        if (this.food >= food) {
            this.food -= food;
            return true;
        } else {
            System.out.print("В миске недостаточно еды! ");
            return false;
        }
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate: food = " + food;
    }
}
