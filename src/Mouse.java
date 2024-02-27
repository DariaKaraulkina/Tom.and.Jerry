public class Mouse {
    String name;
    String color;
    boolean isChild;
    // Круто, что сделала два конструктора здесь, молодец)
    Mouse(String MouseName, String MouseColor) {
        this.name = MouseName;
        this.color = MouseColor;
    }

    Mouse(String MouseName, String MouseColor, boolean isChild) {   // Вот тут параметр isChild никак не используется. То есть метод-конструктор принимает на вход параметр, но к создаваемому объекту типа Мышь он никак не применяется.
        this.name = MouseName;
        this.color = MouseColor;
    }

    public void characteristicsMouse() {

        System.out.println("Мышку зовут " + name + ". Он " + color);
    }

    public void runAway() {

        System.out.println("Мышь  " + name + " убегает");
    }

    public void help(Mouse MouseName) { // п.3.2 в задании: "Метод принимает на вход строку...". У тебя здесь было правильно в прошлый раз)

        System.out.println("Мышь " + name + "  помогает  " + MouseName.name);
    }

    public static void union() {

        System.out.println("Мыши объединились и сплотились!");
    }
}