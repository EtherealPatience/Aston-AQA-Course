public interface IShape {
    public double p = 3.14;

    public double calculatePerimetr();
    public double calculateArea();
    public void showInfo();

    //Task extension
    default public double circleCalculatePerimetr(double radius){
        return 2 * p * radius;
    }

    default public double circleCalculateArea(double radius){
        return p * Math.pow(radius,2);
    }

    default public double rectangleCalculatePerimetr(double width, double length){
        return (length*2) + (width*2);
    }

    default public double rectangleCalculateArea(double width, double length){
        return width * length;
    }

    default public double triangleCalculatePerimetr(double sideA, double sideB, double sideC){
        return sideA + sideB + sideC;
    }

    default public double triangleCalculateArea(double sideA, double sideB, double sideC){
        double halfPerimetr = triangleCalculatePerimetr(sideA, sideB, sideC) / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr-sideA)*(halfPerimetr-sideB)*(halfPerimetr-sideC));
    }
}
