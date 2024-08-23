public class Circle implements Shape{
    public double radius;
    private double p = 3.14;

    @Override
    public double calculatePerimetr() {
        return 2 * p * radius;
    }

    @Override
    public double calculateArea() {
        return p * Math.pow(radius,2);
    }
}
