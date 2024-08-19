public class Main {
    public static void main(String[] args){
        Employee emp = new Employee("Abduldjalilov Kirill Junior","AQA Java engineer","+3751234567",4000,22);
        emp.showInfo();
    }

    public static Employee[] fillEmployeesArray(int length){
        return null;
    }

    public static void displayEmployeesArrayInfo(Employee[] employeesArray){
        for(Employee emp : employeesArray){
            emp.showInfo();
            System.out.println("\n");
        }
    }
}
