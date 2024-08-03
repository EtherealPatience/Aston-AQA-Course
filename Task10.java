public class Task10 {
    public static int[] reverseArrayNumbers(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        return arr;
    }
 }
