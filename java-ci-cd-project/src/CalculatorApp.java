import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();

        System.out.println("Выберите операцию (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        int result = 0;
        switch (operation) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                try {
                    result = calculator.divide(num1, num2);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Неверная операция.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}

