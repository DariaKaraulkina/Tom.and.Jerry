public class Main {
    public static void main(String[] args) {
        Cat Tom = new Cat();
        Tom.name = "Том";
        Tom.age = 5;
        Tom.color = "серый";

        Mouse Jerry = new Mouse();
        Jerry.name = "Джерри";
        Jerry.color = "коричневый";

        Mouse Nibbles = new Mouse();
        Nibbles.name = "Нибблс";
        Nibbles.color = "серый ";
        Nibbles.isChild = true;


        Tom.characteristicsCat();
        Jerry.characteristicsMous();
        Tom.hunting();
        Jerry.runAway();
        Tom.chase("Джерри");
        Nibbles.characteristicsMous();
        Jerry.union();
        Nibbles.help("Джерри");

        System.out.println("Ура! Джерри спасён!");
    }
}