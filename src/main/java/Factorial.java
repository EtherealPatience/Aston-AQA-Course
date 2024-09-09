public class Factorial {
    public static int getFactorial(int num){
        if(num < 0){
            throw new IllegalArgumentException("У отрицательных чисел нет факториала");
        }
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }
}
