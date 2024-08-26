import com.sun.source.doctree.SummaryTree;

public class Main {
    public static void main(String[] args){
        try {
            System.out.println(sumArrayElements(new String[][]{{"1", "2", "3", "10"}, {"4", "5", "6", "10"}, {"7", "8", "9", "10"}, {"10", "11", "12", "13"}}));
        }
        catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
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
