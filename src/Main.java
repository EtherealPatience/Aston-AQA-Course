public class Main {
    public static void main(String[] args){
        printMatrix(new String[][] {{"1", "2", "3", "10"}, {"4", "5", "6", "10"}, {"7", "8", "9", "10"}, {"10", "11", "12", "10"}});

    }

    public static void printMatrix(String[][] matrix){
        try{
            //Matrix check
            for(int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[i].length; j++)
                    if(matrix.length != 4 || matrix[i].length != 4)
                        throw new MyArraySizeException();

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch (MyArraySizeException e){
            System.out.printf("Исключение: размерность матрицы не 4x4");
        }
    }
}
