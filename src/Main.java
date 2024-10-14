import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestString = "";

        while (true) {
            System.out.println("Введіть рядок (або 'done' для завершення):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            if (input.length() > longestString.length()) {
                longestString = input;
            }
        }

        if (!longestString.isEmpty()) {
            System.out.println("Найдовший рядок: " + longestString);
        } else {
            System.out.println("Жоден рядок не був введений.");
        }

        scanner.close();
    }
}
