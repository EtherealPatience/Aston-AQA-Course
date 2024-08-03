public class Main {
    public static void main(String[] args){
        Task1.printThreeWords();
        printSeparator();
        Task2.checkSumSign();
        printSeparator();
        Task3.printColor();
        printSeparator();
        Task4.compareNumbers();
        printSeparator();
        System.out.println(Task5.checkSumInRange(4,6));
        printSeparator();
        Task6.checkNumberPositivity(0);
        printSeparator();
        System.out.println(Task7.isNumberPositive(0));
        printSeparator();
        Task8.printStringCyclically("Hello, world!", 4);
        printSeparator();
        System.out.println(Task9.isYearLeap(1500));
        printSeparator();
        printArray(Task10.reverseArrayNumbers(new int[]{0, 1, 1, 0, 1}));
        printSeparator();
        printArray(Task11.fillArray(new int[100]));
        printSeparator();
        printArray(Task12.changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}));
        printSeparator();
        printMatrix(Task13.fillDiagonalElements(new int[5][5]));

    }

    public static void printSeparator(){
        System.out.println("---------------------");
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
