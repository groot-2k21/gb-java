public class Dz5 {
    public static void main(String[] args) {
        Employee[] empList = new Employee[5];
        empList[0] = new Employee("Пупкин Василий Васильевич", "Гендир", "pupkin@gendir.com", "+7911", 35, 1000000);
        empList[1] = new Employee("Иванов Иван Иванович", "Замгендира", "ivanov@roga.kopyta", "+792343", 42, 124454);
        empList[2] = new Employee("Чумаков Валерий Павлович", "Гл. инженер", "v220@naprugi.net", "+7345345", 27, 155938);
        empList[3] = new Employee("Петров Пётр Семенович", "Зав. складом", "sklad@pripasov.net", "+&347567", 57, 15000);
        empList[4] = new Employee("Ромашкин Руслан Романович", "Дворник", "manager@vsegdachitso.gow", "+7349846", 61, 10000);

        for (byte i=0; i < empList.length; i++)
            if (empList[i].getAge() > 40){
                empList[i].getInfo();
                System.out.println();
            }
    }
}


class Employee{
    private String fullName;
    private String employee;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String employee, String email, String phone, int age, int salary) {
        setFullName(fullName);
        setEmployee(employee);
        setEmail(email);
        setPhone(phone);
        setAge(age);
        setSalary(salary);
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void getInfo(){
        System.out.println("Ф.И.О: " + this.fullName);
        System.out.println("Должность: " + this.employee);
        System.out.println("E-mail: " + this.email);
        System.out.println("Телефон: " + this.phone);
        System.out.println("Возраст: " + this.age);
        System.out.println("Зарплата: " + this.salary);
    }
}