public class Main {
    public static void main(String[] args){
        String[][] array = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            System.out.println("Сумма элементов массива " + sumArrayElements(array));
            array[1][2] = "lol";
            System.out.println(sumArrayElements(array));
        }
        catch (MyArraySizeException | MyArrayDataException e){
            System.out.println("Исключение: " + e.getMessage());
        }
    }

    public static int sumArrayElements (String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        int correctSize = 4;
        int sum = 0;

        if(matrix.length != correctSize)
            throw new MyArraySizeException();

        for(String[] arr : matrix)
            if(arr.length != correctSize)
                throw new MyArraySizeException();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                try{
                    sum += Integer.parseInt(matrix[i][j]);
                }
                catch(NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}
