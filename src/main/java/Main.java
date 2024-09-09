public class Main {
    public static void main(String[] args){
        try{
            System.out.println(Factorial.getFactorial(-10));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
