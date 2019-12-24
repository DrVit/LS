package DrV.company.lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 150, 1, 1.5F);
        Dog dog = new Dog("Sharik", 600, 8, 0.5F);
        cat.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
//  Проверка на валидность по собакам
        if (dog.run() == true) {
            System.out.print("Dog: " + dog.name + ", run: true");
        }else {
            System.out.print("Dog: " + dog.name + ", run: false");
        }
        if (dog.swim() == true) {
            System.out.print(", swim: true");
        }else {
            System.out.print(", swim: false");
        }
        if (dog.jump() == true) {
            System.out.println(", jump: true");
        }else {
            System.out.println(", jump: false");
        }
//  Проверка на валидность по кошкам
        cat.catInfo();
        if (cat.run() == true) {
            System.out.print("Cat: " + cat.name + ", run: true");
        }else {
            System.out.print("Cat: " + cat.name + ", run: false");
        }
        if (cat.swim() == true) {
            System.out.print( ", swim: true");
        }else {
            System.out.print(", swim: false");
        }
        if (cat.jump() == true) {
            System.out.println(", jump: true");
        }else {
            System.out.println(", jump: false");
        }


    }

}
