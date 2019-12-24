package DrV.company.lesson7;

import java.util.Scanner;
//Класс Cat
public class Cat {
    private String name;
    private int appetite;
    private boolean fuel;
// Метод конструктор Cat
    public Cat(String name, int appetite, boolean fuel) {
        this.name = name;
        this.appetite = appetite;
        this.fuel = fuel;
    }
//  Метод поедания
    public void  eat(Plate plate) {
//Проверка остатка корма в тарелке
        if (plate.checkFood(appetite) == true) {
//Процесс поедания корма
            plate.decreaseFood(appetite);
//Сытость
            fuel = true;
        } else {
//При нехватке корма в тарелке
           System.out.println("Cat: " + name + " say MIAO and get out hungry.");
        }

    }
// Метод вывод информации о сытости кота
    public void infoCat() {
        System.out.println("Cat: " + name + "; fuel: " + fuel);
    }
}
// Класс Plate
class Plate{
    private int food;
    static Scanner scanner = new Scanner(System.in);
    public Plate(int food) {
        this.food = food;
    }
// Метод добавления корма
    public void setFood(int food) {
        this.food = food;
        int foodAdd;
        System.out.println("Не хватает корма. Добавим корм? 1 - Да, 2 - Нет.");
        if (scanner.nextInt() == 1) {
            System.out.println("Введите добавляемое значение");
            food += scanner.nextInt();
        }

        this.food = food;
    }
//Метод уменьшения кориа в тарелке
    public void decreaseFood(int minus) {
            food -= minus;
    }
//Метод определения остатка корма в тарелке
    public boolean checkFood(int check) {
        if(food < check) {
            setFood(food);
        }
        if (food >= check) {
                return true;
        }
            return false;

    }
//Метод вывода информации о остатке корма в тарелке
    public void info() {
        System.out.println("Plate: " + food);
    }

}
//Метод main
class main {
    public static void main(String[] args) {
//Объявляем массив Cat
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 200, false);
        cat[1] = new Cat("Black", 150, false);
        cat[2] = new Cat("White", 250, false);
        cat[3] = new Cat("Murzik", 220, false);
        cat[4] = new Cat("Orange", 200, false);
        Plate plate = new Plate(1000);
// Кормим котов
        for (int i = 0; i < cat.length; i++) {
            plate.info();
            cat[i].eat(plate);
            cat[i].infoCat();
            plate.info();
        }
    }
}