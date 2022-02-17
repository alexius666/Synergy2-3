package java_synergy;
import java.util.Scanner;

public class BasicMain {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN =  "\033[0;92m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\033[4;36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public BasicMain() {
        System.out.println(ANSI_CYAN+"<<---------------------------------------------------------------------------->>");
        System.out.println(ANSI_GREEN+"Приветствую. Я калькулятор для третьего класса.");
        System.out.println(ANSI_CYAN + "Возможные Опрации" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "1. Таблица умножения");
        System.out.println("2. Деление двух простых чисел");
        System.out.println("3. Деление с остатком");
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        String userIn;
        userIn = scanner.nextLine();
        switch (userIn) {
            case "1": {
                new MultiplicationTable();
                break;
            }
            case "2": {
                new Division();
                break;
            }
            case "3": {
                new DivisionWithRemainder();
                break;
            }
            default:
                System.out.println("Конец");
        }
    }
    public static void PreCalculate(int x, int y) throws NonThirdClassException {
        if (y <= x) {
        } else {
            throw new NonThirdClassException();
        }
    }
}
