public abstract class Animal {
    protected String name;
    protected int age;
    protected int runLimit;
    protected int swimLimit;

    protected abstract void run(int distance);
    protected abstract void swim(int distance);
    protected abstract void showInfo();

    protected Animal(String _name, int _age){
        name = _name;
        age = _age;
    }
}
