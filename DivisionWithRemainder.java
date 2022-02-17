package java_synergy;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java_synergy.BasicMain.*;

public class DivisionWithRemainder {
    DivisionWithRemainder() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print(ANSI_GREEN+"делимое: ");
            int x = scanner.nextInt();
            System.out.print("делитель: ");
            int y = scanner.nextInt();
            PreCalculate(x,y);
            int z=x%y;
            System.out.println("Ответ: "+x+ " : "+y+" = "+x/y+" остаток: "+z);

        } catch (InputMismatchException ie) {
            System.out.println(ANSI_RED+"Внимание! Операции возможны только с цифрами"+ANSI_RESET);
        }catch (ArithmeticException ae) {
            System.out.println(ANSI_RED + "Внимание! Нарушено основное правило математики - Деление на ноль" + ANSI_RESET);
        } catch (NonThirdClassException ntce) {
            System.out.println(ANSI_RED + "Внимание! Попытка разделить меньшее число на большее. Это мы еще не проходили"+ ANSI_RESET);
        } finally {
            new BasicMain();
        }

    }
}
