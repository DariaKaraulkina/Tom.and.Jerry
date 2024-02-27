public class Cat {
    String name;
    int age;
    String color;

    Cat(String CatName, int CatAge, String CatColor) {
        this.name = CatName;
        this.age = CatAge;
        this.color = CatColor;
    }

    public void characteristicsCat() {
        System.out.println("Котика зовут " + this.name + ". Ему " + this.age + " лет. Он " + this.color);
    }

    public void hunting() {

        System.out.println("Кот " + this.name + " охотится");
    }

    public void chase(Mouse MouseName) {    //  А вот тут с типом теперь всё ок. Но название переменной спорное: всё-таки на вход подаём саму мышь, а не её имя.
        System.out.println("Кот " + this.name + "  догоняет мышь " + MouseName.name);
    }
}

