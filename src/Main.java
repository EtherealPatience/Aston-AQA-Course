public class Main {
    public static void main(String[] args){
        Employee[] employeeArray = fillEmployeesArray();
        displayEmployeesArrayInfo(employeeArray);
    }

    public static Employee[] fillEmployeesArray(){
        //Done in order to avoid fixed values in the program
        int length = 5;
        int n = 0;
        Employee[] employeeArray = new Employee[length];
        employeeArray[n++] = new Employee("Abduldjalilov Kirill Junior","AQA Java engineer",
                "kirillabduldjalilov@gmail.com","+3751234567",4000,22);
        employeeArray[n++] = new Employee("Vatko Sergey Ibragimovich","Java engineer",
                "vatkosergey@gmail.com","+3752234523",3500,25);
        employeeArray[n++] = new Employee("Soldatenko Dmitrii Vyacheslavovich","Team lead",
                "soldatenkodima@gmail.com","+3751234567",6000,29);
        employeeArray[n++] = new Employee("Akter Elizabeth Sergeevna","HR",
                "akterliza@gmail.com","+3755423124",3500,22);
        employeeArray[n++] = new Employee("Chikoi Adam Pavlovich","AQA Java engineer",
                "chikoiadam@gmail.com","+3757654321",4000,22);
        return employeeArray;
    }

    public static void displayEmployeesArrayInfo(Employee[] employeeArray){
        for(Employee emp : employeeArray){
            emp.showInfo();
            System.out.println();
        }
    }
}
