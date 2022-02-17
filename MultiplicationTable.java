package java_synergy;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java_synergy.BasicMain.*;

public class MultiplicationTable {
    MultiplicationTable() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print(ANSI_GREEN + "Введите интересующий множитель: ");
            int userIn;
            userIn = scanner.nextInt();
            for (int i = 1; i < 11; i++) {
                System.out.println(userIn + " x " + i + " = " + i * userIn);
            }
        } catch (InputMismatchException ie) {
            System.out.println(ANSI_RED + "Внимание! Операции возможны только с цифрами" + ANSI_RESET);
            new BasicMain();
        }
    }
}
