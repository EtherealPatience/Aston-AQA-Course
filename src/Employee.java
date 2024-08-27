public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("Сотрудник " + fullName + ":\n" +
                "занимаемая должность: " + position + "\n" +
                "email: " + email + "\n" +
                "возраст: " + age + "\n" +
                "мобильный телефон: " + phone + "\n" +
                "зарплата: " + salary);
    }
}