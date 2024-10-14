import java.util.Scanner;

public class Main {

    // Метод для перевірки, чи є число простим
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // Числа менші за 2 не є простими
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // Якщо знайшли дільник, число не є простим
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо три числа
        System.out.print("Введіть перше число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введіть третє число: ");
        int num3 = scanner.nextInt();

        System.out.println("Числа, що не є простими:");

        // Перевіряємо кожне з чисел і виводимо, якщо воно не просте
        if (!isPrime(num1)) {
            System.out.println(num1);
        }

        if (!isPrime(num2)) {
            System.out.println(num2);
        }

        if (!isPrime(num3)) {
            System.out.println(num3);
        }
    }
}
