public class Triangle implements IShape{
    public String fillColor;
    public String borderColor;
    public double sideA;
    public double sideB;
    public double sideC;
    public double halfPerimetr;

    @Override
    public double calculatePerimetr() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        halfPerimetr = calculatePerimetr() / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr-sideA)*(halfPerimetr-sideB)*(halfPerimetr-sideC));
    }

    @Override
    public void showInfo() {
        System.out.printf("Фигура: треугольник" + "\n" +
                "Цвет заливки: " + fillColor + "\n" +
                "Цвет границы: " + borderColor + "\n" +
                "Сторона А: " + sideA + "\n" +
                "Сторона B: " + sideB + "\n" +
                "Сторона C: " + sideC + "\n" +
                "Периметр: %.2f" + "\n" +
                "Площадь: %.2f\n", calculatePerimetr(), calculateArea());

    }

    public Triangle(String _fillColor, String _borderColor, double _sideA, double _sideB, double _sideC){
        fillColor = _fillColor;
        borderColor = _borderColor;
        sideA = _sideA;
        sideB = _sideB;
        sideC = _sideC;
    }
}
