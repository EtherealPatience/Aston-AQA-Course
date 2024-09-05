import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        String[] arrayNames = new String[]{
                "Kirill", "Vitaly","Pavel", "Kirill",
                "Lelouch", "Griffith", "Kirill", "Vitaly",
                "Osaka", "Pavel", "Vitaly", "Kirill",
                "Griffith", "Mikasa", "Frieren", "Lelouch"
        };

        HashSet<String> setNames = new HashSet<>(Arrays.asList(arrayNames));
        HashMap<String, Integer> mapNames = fillMap(new HashMap<>(), arrayNames);

        System.out.println("All names - " + Arrays.toString(arrayNames));
        System.out.println("Unique names - " + setNames);
        System.out.println("Count names - " + mapNames);
    }

    public static HashMap<String, Integer> fillMap(HashMap<String, Integer> map, String[] arr){
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        return map;
    }
}
