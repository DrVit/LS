package DrV.company;


import java.util.Random;
import java.util.Scanner;

public class Study4 {
    static int size_X = 3;
    static int size_Y = 3;

    static char[][] field = new char[size_X][size_Y];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static final char Player_Dot = 'X';
    static final char Ai_Dot = '0';
    static final char Empty_Dot = '.';
    // Создаем двумерный массив 3x3 и заполняем точками
    static void initField() {
        for (int i = 0; i < size_Y; i++) {
            for (int j = 0; j < size_X; j++) {
                field[i][j] = Empty_Dot;
            }
        }
    }
    //Создаем шаблон игрового поля
    static void printField() {
        for (int i = 0; i < size_Y; i++) {
            if (i == 0) {
                System.out.print("    " + (i + 1) + "   ");
            } else {
                System.out.print((i + 1) + "   ");
            }
        }
//Выводим игровое поле в консоль
        System.out.println();
        for (int i = 0; i < size_Y; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < size_X; j++) {
                System.out.print(field[i][j] + " | ");
            }
            System.out.println();
        }
    }
    //Метод "Ход игрока"
    static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
//Проверка ячейки на возможность игры
        while (!valid(y, x));
        setSymbol(y, x, Player_Dot);
    }
    //Метод присвоения ячейки X или 0 в зависимости от игрока
    private static void setSymbol(int y, int x, char symbol) {
        field[y][x] = symbol;
    }
    //Метод проверки правильности номера ячейки
    private static boolean valid(int y, int x) {
        if (x < 0 || y < 0 || x > size_X - 1 || y >size_Y - 1) {
            return false;
        }
        return field[y][x] == Empty_Dot;
    }
    //Метод "Ход компьютера"
    static void aiStep() {
        int x;
        int y;
//  Элемент искусственного интеллекта :)
//        if (field[1][1] == Empty_Dot) {
//          x = 1;
//          y = 1;
//        }else
        do {
            x = random.nextInt(size_X);
            y = random.nextInt(size_Y);
        }

//Проверка ячейки на возможность игры
        while (!valid(y, x));
        setSymbol(y, x, Ai_Dot);
    }
    //Метод проверки наличия игровых ячеек
    static boolean isFieldsFull() {
        for (int i = 0; i < size_Y; i++) {
            for (int j = 0; j < size_X; j++) {
                if (field[i][j] == Empty_Dot) return false;
            }
        }
        return true;
    }
// Метод "Логика победы"
//При использовании поля 5x5 и 4-х фишек - static int size_X и size_Y = 5,
// а в строке   } if (k == 3 || n == 3 || l == 3 || m == 3) return true; 3 меняем на 4

    static boolean checkWin(char symbol) {
        for (int j =0; j < size_Y; j++) {
            int k = 0; int n = 0; int l = 0; int m = 0;
            for (int i = 0; i < size_X; i++) {
// Проверка строк и столбцов
                if (field[j][i] == symbol) k = k+1;
                if (field[i][j] == symbol) n = n+1;
// Проверка диагоналей
                if (field[i][i] == symbol) l = l +1;
                if (field [size_X-1-i][i] == symbol) m = m + 1;
            } if (k == 3 || n == 3 || l == 3 || m == 3) return true;
        } return false;
    }
    // Метод main
    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWin(Player_Dot)) {
                System.out.println("Player WIN!");
                break;
            }
            if (isFieldsFull()) {
                System.out.println("DRAW");
                break;
            }
            aiStep();
            printField();
            if (checkWin(Ai_Dot)) {
                System.out.println("SkyNet WIN!");
                break;
            }
            if (isFieldsFull()) {
                System.out.println("DRAW");
                break;
            }
        }


    }
}
