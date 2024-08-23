public class Cat extends Animal{
    public String breed;

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
        System.out.println("Котик " + name + ", возраст - " + age + ", порода - " + breed);
    }

    protected Cat(String _name, int _age, String _breed) {
        super(_name, _age);
        breed = _breed;
        runLimit = 200;
        swimLimit = 0;
    }
}
