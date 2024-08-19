public class Employee {
    String fullName;
    String position;
    String phone;
    int salary;
    int age;

    public Employee(String _fullName, String _position, String _phone, int _salary, int _age){
        fullName = _fullName;
        position = _position;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

    public void showInfo(){
        System.out.println("Сотрудник " + fullName + "\n" +
                "занимаемая должность: " + position + "\n" +
                "возраст: " + age + "\n" +
                "мобильный телефон: " + phone + "\n" +
                "зарплата: " + salary);
    }
}