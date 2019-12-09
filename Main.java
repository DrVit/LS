package DrV.company;

import java.util.Scanner;

public class Main {
//1. Прописываем метод main()
    public static void main(String[] args) {
//2. Создаем переменные всех пройденных типов данных и инициализируем их значения
        byte byteVal = 10;
        short shortVal = -100;
        int intVal = 1000;
        long longVal = 1000L;
        float floatVal = 123.23f;
        double doubleVal = 12345.123;
        char charVal = '\uabcd';
        boolean booleanVal = true;
    }
//3. Метод вычисляющий выражение a*(b+(c/d)) возвращающий результат
        private static float calculate (float a, float b,float c, float d) {
            return a*(b+(c/d));
        }
//4. Метод проверяющий что сумма двух целых чисел находится в промежутке от 10 до 20 включительно
        private static boolean calculate1 (int x1, int x2) {
          if (x1 + x2 >= 10 && x1 + x2 <= 20) {
                return true;
            } else {
                return false;
                   }
        }
//5. Метод определяющий знак целого числа
        private static void positivOrNegative (int x3){
        if (x3 >=0){
            System.out.println("Данное число положительное");
        }else {
            System.out.println("Данное число отрицательное");
              }
        }
//6. Метод определяющий знак целого числа
        private static boolean isNegative (int x4) {
        if (x4 < 0) {
            return true;
                     }
            return false;
        }
//7. Метод осуществляющий вывод имени
        private static void hameOut (String name) {
            System.out.println("Привет, " + name);
        }
//8. Метод проверяющий год на високосность
        private static void eventYear (int year) {
            System.out.println("Введите проверяемый год");
                Scanner scanner = new Scanner (System.in);
                year = scanner.nextInt();
                if (year % 400 == 0){
                    System.out.println("ВВеденный год високосный");
                } else
                if (year % 100 == 0) {
                    System.out.println("ВВеденный год не високосный");
                } else
                if (year % 4 == 0) {
                    System.out.println("ВВеденный год високосный");
                } else {
                    System.out.println("ВВеденный год не високосный");
                }
            }
}
