public abstract class Animal {
    private String name;
    private int age;
    private int runLimit;
    private int swimLimit;

    protected abstract void run(int distance);
    protected abstract void swim(int distance);

    protected Animal(String _name, int _age, int _rumLimit, int _swimLimit){
        name = _name;
        age = _age;
        runLimit = _rumLimit;
        swimLimit = _swimLimit;
    }
}
