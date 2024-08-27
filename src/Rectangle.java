public class Rectangle implements IShape{
    private String fillColor;
    private String borderColor;
    private double length;
    private double width;

    @Override
    public double calculatePerimetr() {
        return (length*2) + (width*2);
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public void showInfo() {
        System.out.printf("Фигура: прямоугольник" + "\n" +
                "Цвет заливки: " + fillColor + "\n" +
                "Цвет границы: " + borderColor + "\n" +
                "Длина: " + length + "\n" +
                "Ширина: " + width + "\n" +
                "Периметр: %.2f" + "\n" +
                "Площадь: %.2f\n", calculatePerimetr(), calculateArea());
    }

    public Rectangle(String fillColor, String borderColor, double length, double width){
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.length = length;
        this.width = width;
    }
}
