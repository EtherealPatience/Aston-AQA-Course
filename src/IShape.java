public interface IShape {
    double p = 3.14;

    double calculatePerimetr();
    double calculateArea();
    void showInfo();

    //Task extension
    default double circleCalculatePerimetr(double radius){
        return 2 * p * radius;
    }

    default double circleCalculateArea(double radius){
        return p * Math.pow(radius,2);
    }

    default double rectangleCalculatePerimetr(double width, double length){
        return (length*2) + (width*2);
    }

    default double rectangleCalculateArea(double width, double length){
        return width * length;
    }

    default double triangleCalculatePerimetr(double sideA, double sideB, double sideC){
        return sideA + sideB + sideC;
    }

    default double triangleCalculateArea(double sideA, double sideB, double sideC){
        double halfPerimetr = triangleCalculatePerimetr(sideA, sideB, sideC) / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr-sideA)*(halfPerimetr-sideB)*(halfPerimetr-sideC));
    }
}
