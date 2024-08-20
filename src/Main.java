public class Main {
    public static void main(String[] args){
        Employee[] employeeArray = fillEmployeesArray();
        displayEmployeesArrayInfo(employeeArray);
        printSeparator();

        Park park1 = new Park("Лучезарный", "parkluchik@gmail.com", "_3755647262");
        Park park2 = new Park("Солнечный", "sunnypark@gmail.com", "+3759876243");

        Park.Attraction attraction1 = new Park.Attraction("Летающая тарелка", 12, 5, 10, 100, 200);
        Park.Attraction attraction2 = new Park.Attraction("Жемчужина", 8, 3, 8, 80, 200);
        Park.Attraction attraction3 = new Park.Attraction("Юпитер", 10, 4, 2, 40, 140);
        Park.Attraction attraction4 = new Park.Attraction("Парашют", 12, 8, 12, 140, 200);
        Park.Attraction attraction5 = new Park.Attraction("Комната страха", 8, 10, 14, 120, 240);

        park1.addAttraction(attraction1);
        park1.addAttraction(attraction2);
        park1.addAttraction(attraction3);
        park2.addAttraction(attraction3);
        park2.addAttraction(attraction4);
        park2.addAttraction(attraction5);
        printSeparator();

        park1.showAttractionsInfo();
        printSeparator();
        park2.showAttractionsInfo();
        printSeparator();
        park1.deleteAttraction(attraction2);
        park1.showAttractionsInfo();
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

    public static void printSeparator(){
        System.out.println("------------------------------------------");
    }
}
