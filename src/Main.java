public class Main {
    public static void main(String[] args){
        Employee[] employeeArray = fillEmployeesArray();
        displayEmployeesArrayInfo(employeeArray);
    }

    public static Employee[] fillEmployeesArray(){
        int length = 5;
        Employee[] employeeArray = new Employee[length];
        employeeArray[0] = new Employee("Abduldjalilov Kirill Junior","AQA Java engineer","+3751234567",4000,22);
        employeeArray[1] = new Employee("Vatko Sergey Ibragimovich","Java engineer","+3752234523",3500,25);
        employeeArray[2] = new Employee("Soldatenko Dmitrii Vyacheslavovich","Team lead","+3751234567",6000,29);
        employeeArray[3] = new Employee("Akter Elizabeth Sergeevna","HR","+3755423124",3500,22);
        employeeArray[4] = new Employee("Chikoi Adam Pavlovich","AQA Java engineer","+3757654321",4000,22);
        return employeeArray;
    }

    public static void displayEmployeesArrayInfo(Employee[] employeeArray){
        for(Employee emp : employeeArray){
            emp.showInfo();
            System.out.println("\n");
        }
    }
}
