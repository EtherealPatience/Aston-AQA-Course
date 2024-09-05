import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        String[] arrayNames = new String[]{
                "Kirill", "Vitaly","Pavel", "Kirill",
                "Lelouch", "Griffith", "Kirill", "Vitaly",
                "Osaka", "Pavel", "Vitaly", "Kirill",
                "Griffith", "Mikasa", "Frieren", "Lelouch"
        };

        HashSet<String> setNames = new HashSet<String>(Arrays.asList(arrayNames));

        System.out.println("All names - " + Arrays.toString(arrayNames));
        System.out.println("Unique names - " + setNames);
    }

    public void printArray(String[] arr){
        System.out.println();
    }
}
