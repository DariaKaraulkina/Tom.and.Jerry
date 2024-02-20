
public class Mouse {
    String name;
    String color;
    boolean isChild;
    // Не использовала подсказку: не определён ни один конструктор

    public void characteristicsMous() { // Опечатка в названии метода

        System.out.println("Мышку зовут " + name + ". Он " + color);
    }

    public void runAway() {

        System.out.println("Мышь  " + name + " убегает");
    }

    public void help(String Mouse) {

        System.out.println("Мышь " + name + "  помогает  " + Mouse);
    }

    public static void union() {
        System.out.println("Мыши объединились и сплотились!");
    }
}
