public class Task10 {
    public static int[] reverseArrayNumbers(int[] arr){
        int[] changedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            changedArray[i] = arr[i] == 0 ? 1 : 0;
        }
        return changedArray;
    }
 }
