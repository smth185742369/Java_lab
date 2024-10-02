import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Генеруємо два випадкові символи у діапазоні від 32 до 65535
        char char1 = (char) (32 + random.nextInt(65504)); // 65535 - 32 + 1 = 65504
        char char2 = (char) (32 + random.nextInt(65504));

        // Друкуємо символи
        System.out.println("Перший символ: " + char1 + " (код: " + (int) char1 + ")");
        System.out.println("Другий символ: " + char2 + " (код: " + (int) char2 + ")");

        // Порівнюємо символи
        if (char1 > char2) {
            System.out.println("Перший символ більший за другий.");
        } else if (char1 < char2) {
            System.out.println("Другий символ більший за перший.");
        } else {
            System.out.println("Обидва символи однакові.");
        }
    }
}