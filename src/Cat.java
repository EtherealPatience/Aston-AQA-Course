public class Cat extends Animal{
    public static int countCat;
    public String breed;
    public boolean isSatiety;

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
        System.out.println("Котик " + name + ", возраст - " +
                age + ", порода - " +
                breed + ", " +
                getSatietyStatus());
    }

    public String getSatietyStatus(){
        return isSatiety ? "сытый" : "голоден";
    }

    public void eat(Bowl bowl, int eatenFood){
        if(isSatiety){
            System.out.println("Котик "+name+" не хочет кушать, он сытый");
            return;
        }
        else if(bowl.countFood > eatenFood){
            bowl.foodDecrease(eatenFood);
            isSatiety = true;
            System.out.println("Котик " + name + " покушал " + eatenFood + " еды");
        }
        else {
            System.out.println("Котик " + name + " не покушал, потому что в миске недостаточно еды, чтобы утолить аппетит");
        }
    }

    protected Cat(String _name, int _age, String _breed) {
        super(_name, _age);
        breed = _breed;
        runLimit = 200;
        swimLimit = 0;
        isSatiety = false;
        countCat++;
    }

    public static void showCountCat(){
        System.out.println("Количество котов: " + countCat);
    }
}
