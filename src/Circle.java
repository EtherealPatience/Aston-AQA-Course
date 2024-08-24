public class Circle implements IShape{
    public double radius;
    public String fillColor;
    public String borderColor;

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

    public Circle(String _fillColor, String _borderColor, double _radius){
        radius = _radius;
        fillColor = _fillColor;
        borderColor = _borderColor;
    }
}
