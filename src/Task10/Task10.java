package Task10;

//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//
//При создании объекта данного класса все поля должны быть заполнены.
//
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//
// Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class Task10 {

    public static void main(String[] args){

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan Ivanovich", "QA", "QAtest@t.c", "+375(33)1111111", 1564.6f, (byte) 33);
        employees[1] = new Employee("Petrov Petr Palych", "AQA", "AQAtest@t.c", "+375(33)2222222", 2410.2f, (byte) 30);
        employees[2] = new Employee("Sidorov Andrey Yrevich", "Yborschik", "Yborschiktest@t.c", "+375(33)3333333", 9999.9f, (byte) 56);
        employees[3] = new Employee("Smirnov Ruslan Andreevich", "BA", "BAtest@t.c", "+375(33)4444444", 2436.5f, (byte) 25);
        employees[4] = new Employee("Zyzin Dzmitry Ihorevich", "Design", "Designtest@t.c", "+375(33)5555555", 1324.0f, (byte) 40);

        for (int i = 0; i < employees.length; i++){
            Employee j = employees[i];
            if (j.Age >= 40){
                String res = employees[i].getValues();
                System.out.println(res);
            }
        }
    }
}
