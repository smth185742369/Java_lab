import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитування трьох цілих чисел
        System.out.print("Введіть число X: ");
        int X = scanner.nextInt();
        System.out.print("Введіть число Y: ");
        int Y = scanner.nextInt();
        System.out.print("Введіть число Z: ");
        int Z = scanner.nextInt();

        // Перевірка умови X > Y > Z > 0
        if (X > Y && Y > Z && X > 0) {
            double Q1 = Math.pow(X, 3) - Y - Math.pow(Z, 2);
            System.out.println("Q = X^3 - Y - Z^2: " + Q1);
        }

        // Перевірка умови Y > X >= Z
        if (Y > X && X >= Z) {
            double Q2 = Math.pow(X, 2) + Y * Z;
            System.out.println("Q = X^2 + Y * Z: " + Q2);
        }

        // Перевірка умови Z >= Y > X
        if (Z >= Y && Y > X) {
            double Q3 = X * Y + Math.pow(Z, X);
            System.out.println("Q = X * Y + Z^X: " + Q3);
        }

        // Загальна формула, якщо всі умови не виконуються
        double Q4 = -X - Y - Z;
        System.out.println("Q = -X - Y - Z: " + Q4);

        scanner.close();
    }
}
