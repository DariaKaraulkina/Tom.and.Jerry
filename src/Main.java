public class Main {
    public static void main(String[] args) {
        Cat Tom = new Cat("Том", 5, "серый");
        Mouse Jerry = new Mouse("Джерри", "коричневый");
        Mouse Nibbles = new Mouse("Нибблс", "серый ", true);

        Tom.characteristicsCat();
        Jerry.characteristicsMouse();
        Tom.hunting();
        Jerry.runAway();
        Tom.chase(Jerry);
        Nibbles.characteristicsMouse();
        Mouse.union();
        Nibbles.help("Джерри");

        System.out.println("Ура! Джерри спасён!");
    }
}
