public class Mouse {
    String name;
    String color;
    boolean isChild;

    Mouse(String MouseName, String MouseColor) {
        this.name = MouseName;
        this.color = MouseColor;
    }

    Mouse(String MouseName, String MouseColor, boolean isChild) {
        this.name = MouseName;
        this.color = MouseColor;
    }

    public void characteristicsMouse() {

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