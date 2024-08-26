public class MyArrayDataException extends Exception{
    public MyArrayDataException(int row, int col){
        super("Некорректный формат в ячейке [" + row + "][" + col + "]");
    }
}
