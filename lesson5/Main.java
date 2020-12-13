package lesson5;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Работов Работник Работникович", "Самый ответственный работник", "worker@ya.ru", "+79876543210", 100500, 45);
        workers[1] = new Worker("Джобный Джоб Джобович", "Работник месяца", "worker_kfc@ya.ru", "+79012345678", 35000, 21);
        workers[2] = new Worker("Иванов Иван Иванович", "Оператов ЭВМ", "hacker@ya.ru", "+79666666666", 100500, 39);
        workers[3] = new Worker("Домоседов Стэйхоум Изоляциович", "Удаленщик", "stayhome@you.com", "+79123456780", 70000, 29);
        workers[4] = new Worker("Вилларибо Виллабаджо Фейревич", "Отмывальщик", "washer@ya.ru", "+79234567801", 45000, 55);

        for (Worker worker : workers) {
            if (worker.age > 40) {
                worker.printInfo();
            }
        }
    }
}