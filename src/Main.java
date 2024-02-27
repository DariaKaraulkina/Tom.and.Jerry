public class Main {
    public static void main(String[] args) {
        Cat Tom = new Cat("Том", 5, "серый");
        Mouse Jerry = new Mouse("Джерри", "коричневый");
        Mouse Nibbles = new Mouse("Нибблс", "серый ", true);    // См. коммент в Mouse в 11 строке. Если вывести в консоль Nibbles.isChild, посмотри, что там будет (спойлер, не true, а false)

        Tom.characteristicsCat();
        Jerry.characteristicsMouse();
        Tom.hunting();
        Jerry.runAway();
        Tom.chase(Jerry);
        Nibbles.characteristicsMouse();
        Mouse.union();
        Nibbles.help(Jerry);

        System.out.println("Ура! Джерри спасён!");
    }
}
