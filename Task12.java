public class Task12 {
    public static int[] changeArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
           if(arr[i] < 6)
               arr[i] *= 2;
        return arr;
    }
}
