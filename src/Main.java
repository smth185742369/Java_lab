import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта Scanner для читання введення з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Запитуємо користувача ввести рядок
        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        // Закриваємо сканер
        scanner.close();

        // Перевіряємо, чи є в рядку бодай одна велика літера
        boolean hasUpperCase = false;
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }

        // Виводимо результат
        if (hasUpperCase) {
            System.out.println("ТАК");
        } else {
            System.out.println("НІ");
        }
    }
}
