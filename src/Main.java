import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Cat cat1 = new Cat("Чилик", 1, "Британская голубая");
        cat1.showInfo();
        cat1.run(300);
        cat1.run(200);
        cat1.swim(10);

        System.out.println();

        Cat cat2 = new Cat("Мявкич", 3, "Сфинкс");
        cat2.showInfo();

        printSeparator();;

        Dog dog1 = new Dog("Круглик", 5, true);
        dog1.showInfo();
        dog1.run(700);
        dog1.run(500);
        dog1.swim(20);
        dog1.swim(10);

        printSeparator();

        Animal.showCountAnimal();
        Cat.showCountCat();
        Dog.showCountDog();

        printSeparator();

        Bowl bowl = new Bowl(20);
        bowl.showCountFood();
        cat1.eat(bowl, 15);
        cat1.eat(bowl, 20);
        cat2.eat(bowl, 20);
        bowl.showCountFood();

        printSeparator();

        Cat cat3 = new Cat("Мурзякус", 4, "Дворняжка");
        Cat cat4 = new Cat("Луна", 2, "Вислоухая");

        bowl.foodIncrease(35);
        bowl.showCountFood();

        Cat[] cats = {cat1, cat2, cat3, cat4};

        for(int i = 0; i < cats.length; i++){
            cats[i].eat(bowl, 15);
            System.out.println(cats[i].getSatietyStatus());
        }

        printTaskSeparator();

        Circle circle = new Circle("Красный", "Чёрный", 2.5);
        circle.showInfo();

        printSeparator();

        Rectangle rect = new Rectangle("Фиолетовый", "Синий", 6.5, 4.5);
        rect.showInfo();
    }

    public static void printSeparator(){
        System.out.println("----------------------------------------");
    }

    public static void printTaskSeparator() {
        String text = "Задание №2";
        int margin = 2;
        String horizontalBorder = "+" + "-".repeat(text.length()+margin) + "+";
        String titleLine = String.format("| %s |", text);

        System.out.println("\n" + horizontalBorder);
        System.out.println(titleLine);
        System.out.println(horizontalBorder);
    }
}
