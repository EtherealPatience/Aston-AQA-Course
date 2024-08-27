public class Cat extends Animal{
    private static int countCat;
    private String breed;
    private boolean isSatiety;

    @Override
    protected void run(int distance) {
        System.out.println(distance > runLimit ?
                "Котик смог пробежать только " + runLimit + " метров, остальные " + (distance - runLimit) + " ему не под силу" :
                "Котик пробежал " + distance + " метров");
    }

    @Override
    protected void swim(int distance){
        System.out.println("Котик не умеет плавать!");
    }

    @Override
    protected void showInfo(){
        System.out.println("Котик " + name +
                ", возраст - " + age
                + ", порода - " + breed +
                ", " + getSatietyStatus());
    }

    protected String getSatietyStatus(){
        return isSatiety ? "сытый" : "голоден";
    }

    protected void eat(Bowl bowl, int eatenFood){
        if(isSatiety){
            System.out.println("Котик "+name+" не хочет кушать, он сытый");
        }
        else if(bowl.getCountFood() > eatenFood){
            bowl.foodDecrease(eatenFood);
            isSatiety = true;
            System.out.println("Котик " + name + " покушал " + eatenFood + " еды");
        }
        else {
            System.out.println("Котик " + name + " не покушал, потому что в миске недостаточно еды, чтобы утолить аппетит");
        }
    }

    protected Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        runLimit = 200;
        swimLimit = 0;
        isSatiety = false;
        countCat++;
    }

    protected static void showCountCat(){
        System.out.println("Количество котов: " + countCat);
    }
}
