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

        HashSet<String> setUniqueNames = new HashSet<>(Arrays.asList(arrayNames));
        HashMap<String, Integer> mapCountNames = fillMapCountNames(new HashMap<>(), arrayNames);

        System.out.println("All names - " + Arrays.toString(arrayNames));
        System.out.println("Unique names - " + setUniqueNames);
        System.out.println("Count names - " + mapCountNames);

        printSeparator();

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Abduldjalilov", "+375447889924");
        phoneDirectory.add("Zoldyck", "+375441234567");
        phoneDirectory.add("Abduldjalilov", "+375440987654");
        phoneDirectory.add("Ackerman", "+375447658421");
        phoneDirectory.add("Abduldjalilov", "+375445452363");
        phoneDirectory.add("Zoldyck", "+375298675462");

        phoneDirectory.showAllContacts();
        phoneDirectory.get("Abduldjalilov");
        phoneDirectory.get("Zoldyck");
        phoneDirectory.get("Ackerman");
    }

    public static HashMap<String, Integer> fillMapCountNames(HashMap<String, Integer> map, String[] arr){
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

    public static void printSeparator(){
        System.out.println("----------------------------------------------------------");
    }
}
