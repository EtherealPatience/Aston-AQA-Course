public abstract class Animal {
    private static int countAnimal;
    protected String name;
    protected int age;
    protected int runLimit;
    protected int swimLimit;

    protected abstract void run(int distance);
    protected abstract void swim(int distance);
    protected abstract void showInfo();

    protected Animal(String name, int age){
        this.name = name;
        this.age = age;
        countAnimal++;
    }

    protected static void showCountAnimal(){
        System.out.println("Общее количество животных: " + countAnimal);
    }
}
