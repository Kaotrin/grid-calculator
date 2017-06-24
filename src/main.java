import java.util.Scanner;

/**
 * Created by Valenta on 15.06.2017.
 */

public class main {
    public static void main(String[] args) {


        double x, y, n, f;

        System.out.println("Расчет данных для сетки ");
        System.out.println("y = пробелы между блоками");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество блоков");
        n = sc.nextInt();

        System.out.println("Введите расстояние между блоками");
        y = sc.nextInt();

        System.out.println("Введите общую ширину сетки");
        f = sc.nextInt();

        if (n <= 0) {
            if (y < 0) {
                printNumberOfBlocksError();
                printDistanceError();
            } else
                printNumberOfBlocksError();
        } else {
            if (y < 0) {
                printDistanceError();
            } else {
                x = (f - (n + 1) * y) / n;
                printResult(y, n, x);
            }
        }
    }

    private static void printDistanceError() {
        System.out.println("Distance between the blocks cannot be less 0.");
    }

    private static void printNumberOfBlocksError() {
        System.out.println("Number of blocks cannot be less than 1.");
    }


    private static void printResult(double y, double n, double x) {
        System.out.println("Блок равен:");
        System.out.println(x);
        System.out.println("пробелы между блоками равны:");
        System.out.println(y);
    }
}