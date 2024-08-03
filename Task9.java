public class Task9 {
    public static boolean isYearLeap(int year){
        return(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}
