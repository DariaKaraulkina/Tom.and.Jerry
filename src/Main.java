public class Main {
    public static void main(String[] args) {    // Общее замечание: проверь ещё раз пробелы и знаки препинания, чтобы текст получился красивым (можно смотреть в образец)
        Cat Tom = new Cat();
        Tom.name = "Том";       // Здесь и ниже: задавать параметры объекта таким образом не очень хорошо (вспомни, почему). Нужно использовать конструкторы.
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
        Jerry.union();      // Вспомни, в чём суть статических методов и параметров. Точно ли его нужно вызывать именно так (через объект класса)?
        Nibbles.help("Джерри");

        System.out.println("Ура! Джерри спасён!");
    }
}