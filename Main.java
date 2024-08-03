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

    }

    public static void printSeparator(){
        System.out.println("---------------------");
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
