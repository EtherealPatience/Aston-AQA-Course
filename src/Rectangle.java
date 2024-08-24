public class Rectangle implements IShape{
    public String fillColor;
    public String borderColor;
    public double length;
    public double width;

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

    public Rectangle(String _fillColor, String _borderColor, double _length, double _width){
        fillColor = _fillColor;
        borderColor = _borderColor;
        length = _length;
        width = _width;
    }
}
