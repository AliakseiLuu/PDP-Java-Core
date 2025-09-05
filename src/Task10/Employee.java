package Task10;

//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//
//При создании объекта данного класса все поля должны быть заполнены.
//
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//
// Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class Employee {

    public String FIO, Title, Email, Phone;
    public float Salary;
    public byte Age;

    public Employee(String _FIO, String _Title, String _Email, String _Phone, float _Salary, byte _Age){
        this.FIO = _FIO;
        this.Title = _Title;
        this.Email = _Email;
        this.Phone = _Phone;
        this.Salary = _Salary;
        this.Age = _Age;
    }

    public String getValues (){
        String employeeInfo = ("FIO: " + FIO + "; Title: " + Title + "; Email: " + Email + "; Phone: " + Phone + "; Salary: " + Salary + "; Age: " + Age + ".\n");
        return employeeInfo;
    }
}
