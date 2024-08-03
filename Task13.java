public class Task13 {
    public static int[][] fillDiagonalElements(int[][] arr){
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i].length; j++)
                if(i == j || i + j == arr.length - 1)
                    arr[i][j] = 1;
        return arr;
    }
}
