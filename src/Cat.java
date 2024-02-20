import java.sql.SQLOutput;

public class Cat {
    String name;
    int age;
    String color;

    public void characteristicsCat() {
        System.out.println("Котика зовут " + name + " Ему " + age + " лет. Он " + color);
    }

    public void hunting() {

        System.out.println("Кот " + name + " охотится");
    }

    public void chase(String Mouse) {

        System.out.println("Кот " + name + "  догоняет мышь " + Mouse);
    }
}
