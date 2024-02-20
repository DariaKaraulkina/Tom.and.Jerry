import java.sql.SQLOutput;      // Даже боюсь предположить, откуда тут импорт sql)

public class Cat {
    String name;
    int age;
    String color;
    // Не использовала подсказку: не определён ни один конструктор
    public void characteristicsCat() {
        System.out.println("Котика зовут " + name + " Ему " + age + " лет. Он " + color);
    }

    public void hunting() {

        System.out.println("Кот " + name + " охотится");
    }

    public void chase(String Mouse) {   // По заданию на вход нужно принимать объект типа Mouse (см. п. 3.1). Здесь метод принимает на вход строку.

        System.out.println("Кот " + name + "  догоняет мышь " + Mouse);
    }
}
