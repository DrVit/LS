package DrV.company;

import org.w3c.dom.ls.LSOutput;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.Scanner;

public class Study {

    private static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {

//11111111   Первое задание

        System.out.println("Игра " + "'Угадай число'.");
        System.out.println("Я загадываю число от 0 до 9, а Вы с трех раз пытаетесь его отгадать.");
        int num = 9;
        playCircle(num);
        scanner.close();
    }
        private static void playCircle(int num) {
        int inputNim1 = 1;
        while (inputNim1 > 0) {
            int number = (int) (Math.random() * num);
            System.out.println("Угадайте число от 0 до 9");
            for (int i = 0; i < 3; i++) {
                System.out.println("" + (i +1) + "-ая попытка.");
                int inputNum = scanner.nextInt();
                if (inputNum == number) {
                    System.out.println("Число угадано верно.");
                    break;
                } else if (inputNum > number) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
            System.out.println("Поиграем еще? " +"Да - 1 " +"Нет - 0");
            int inputNum1 = scanner.nextInt();
            inputNim1 = inputNum1;

        }
    }
}