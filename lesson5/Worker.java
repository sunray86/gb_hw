package lesson5;

import java.util.Locale;

public class Worker {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Worker (String name, String position, String email, String phone, int salary, int age) {
        this.name = name != null ? name.toUpperCase() : null;
        this.position = position != null ? position.toUpperCase() : null;
        this.email = email != null ? email.toUpperCase() : null;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo () {
        System.out.printf("Меня зовут: %s, моя должность - %s. Моя почта: %s и телефон: %s.%nЯ зарабатываю %d, и мне %d.%n",name, position, email, phone, salary, age);
    }
}
