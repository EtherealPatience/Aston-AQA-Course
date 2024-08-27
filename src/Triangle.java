public class Triangle implements IShape{
    private String fillColor;
    private String borderColor;
    private double sideA;
    private double sideB;
    private double sideC;
    private double halfPerimetr;

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

    public Triangle(String fillColor, String borderColor, double sideA, double sideB, double sideC){
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
