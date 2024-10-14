import java.util.*;

public class Main {
    public static void main(String[] args) {
        double step = 0.2;
        double start = -1.0;
        double end = 1.0;

        System.out.println("x\t\ty");

        for (double x = start; x <= end; x += step) {
            try {
                double y = function(x);
                System.out.printf("%.2f\t\t%.6f%n", x, y);
            } catch (ArithmeticException e) {
                System.out.printf("%.2f\t\tError: %s%n", x, e.getMessage());
            }
        }
    }

    public static double function(double x) {
        // Обчислення значення функції
        double sinPowX = Math.pow(Math.sin(x), x);
        double cosPowX = Math.pow(Math.cos(x), x);

        if (sinPowX == 0 || cosPowX == 0) {
            throw new ArithmeticException("Division by zero");
        }

        return 1 / sinPowX + 1 / cosPowX;
    }
}