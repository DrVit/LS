package DrV.company.lesson5_1;
// Объявление полей
public class Person1 {
    private int age;
    private String phone;
    private String name;
    private String spec;
    private String email;
    private float salary;
// Конструктор класса
    public Person1(String name, String spec, String email, String phone, float salary, int age) {
        this.name = name;
        this.spec = spec;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
// Метод вывода информации об объекте в консоль
    private void info() {
        System.out.println("Имя и Фамилия: " + name +"; Должность: " + spec + "; E-mail: " + email +
               "; Телефон: " + phone + "; Зарплата: " + salary + " Возраст: " +age);
    }
// Метод main
    public static void main(String[] args) {
// Объявляем массив объектов
        Person1[] persArray = new Person1[5];
//Задаем объект для каждой ячейки массива
        persArray[0] = new Person1("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                "89231231212", 30000F, 30);
        persArray[1] = new Person1("Petrov Petr", "Worker", "peterpetr@mailbox.com",
                "89613475656", 25000F, 28);
        persArray[2] = new Person1("Nikolay Nikolaev", "Worker", "niknikr@mailbox.com",
                "89613475664", 27000F, 32);
        persArray[3] = new Person1("Sergey Sergeev", "Economist", "sergser@mailbox.com",
                "89676475664", 32000F, 42);
        persArray[4] = new Person1("Sidorov Oleg", "Guard", "sidoroleg@mailbox.com",
                "89676834664", 24000F, 45);
//Вывод информации о сотрудниках старше 40 лет
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40)
                System.out.println("Имя и Фамилия: " + persArray[i].name +"; Должность: " + persArray[i].spec + ";" +
                        " E-mail: " + persArray[i].email +
                        "; Телефон: " + persArray[i].phone + "; Зарплата: " + persArray[i].salary + " Возраст: "
                        + persArray[i].age);

        }

    }
}
