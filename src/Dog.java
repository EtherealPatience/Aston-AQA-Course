public class Dog extends Animal{
    public static int countDog;
    public boolean isGuardian;

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

    protected Dog(String _name, int _age, boolean _isGuardian){
        super(_name, _age);
        runLimit = 500;
        swimLimit = 10;
        isGuardian = _isGuardian;
        countDog++;
    }

    public static void showCountDog(){
        System.out.println("Количество собак: " + countDog);
    }
}
