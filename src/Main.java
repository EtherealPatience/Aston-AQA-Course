public class Main {
    public static void main(String[] args){
        Cat cat1 = new Cat("Чилик", 1, "Британская голубая");
        cat1.showInfo();
        cat1.run(300);
        cat1.run(200);
        cat1.swim(10);

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
    }

    public static void printSeparator(){
        System.out.println("----------------------------------------");
    }
}
