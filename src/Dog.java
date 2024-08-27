public class Dog extends Animal{
    private static int countDog;
    private boolean isGuardian;

    @Override
    protected void run(int distance) {
        System.out.println(distance > runLimit ?
                "Собачка смогла пробежать только " + runLimit + " метров, остальные " + (distance - runLimit) + " ей не под силу" :
                "Собачка пробежала " + distance + " метров");
    }

    @Override
    protected void swim(int distance) {
        System.out.println(distance > swimLimit ?
                "Собачка смогла проплыть только " + swimLimit + " метров, остальные " + (distance - swimLimit) + " ей не под силу" :
                "Собачка проплыла " + distance + " метров");
    }

    @Override
    protected void showInfo() {
        System.out.println("Собачка " + name + ", возраст - " + age + ", классификация  - " + getGuardianStatus());
    }

    private String getGuardianStatus(){
        return isGuardian? "защитная порода" : "декоративная порода";
    }

    protected Dog(String name, int age, boolean isGuardian){
        super(name, age);
        runLimit = 500;
        swimLimit = 10;
        this.isGuardian = isGuardian;
        countDog++;
    }

    protected static void showCountDog(){
        System.out.println("Количество собак: " + countDog);
    }
}
