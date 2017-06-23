import java.util.Scanner;

/**
 * Created by Valenta on 15.06.2017.
 */

public class main {
    public static void main(String[] args) {

        double x, y, n;

        System.out.println("x = блок");
        System.out.println("y = пробелы между блоками");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество блоков");
        n = sc.nextInt();

        System.out.println("Введите расстояние между блоками");
        y = sc.nextInt();

        if (n <= 0) {
            if (y < 0) {
                System.out.println("Ошибка 1");
                System.out.println("Ошибка 2");
            } else
                System.out.println("Ошибка 1");
        } else {
            if (y < 0) {
                System.out.println("Ошибка 2");
            } else {
                System.out.println("Блок равен:");
                x = (960 - (n + 1) * y) / n;
                System.out.println(x);
                System.out.println("пробелы между блоками равны:");
                System.out.println(y);
            }
        }
    }
}