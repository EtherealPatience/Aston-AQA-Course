public class Circle implements IShape{
    private double radius;
    private String fillColor;
    private String borderColor;

    @Override
    public double calculatePerimetr() {
        return 2 * p * radius;
    }

    @Override
    public double calculateArea() {
        return p * Math.pow(radius,2);
    }

    @Override
    public void showInfo(){
        System.out.printf("Фигура: круг" + "\n" +
                "Цвет заливки: " + fillColor + "\n" +
                "Цвет границы: " + borderColor + "\n" +
                "Радиус: " + radius + "\n" +
                "Периметр: %.2f" + "\n" +
                "Площадь: %.2f\n", calculatePerimetr(), calculateArea());
    }

    public Circle(String fillColor, String borderColor, double radius){
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
}
