public class Task3 {
    public static void printColor(){
        int value = 4;
        String color;

        if(value <= 0)
            color = "Красный";
        else if(value > 100)
            color = "Зеленый";
        else
            color = "Желтый";

        System.out.println(color);
    }
}
