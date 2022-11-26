import java.util.Scanner;

public class Dz3 {
    public static void main(String[] args) {
        System.out.println("---------------------------------- \n" +
        "Калькулятор \n" +
        "----------------------------------");
        System.out.println("Вы можете: \n" +
        "1. Складывать (+) \n" +
        "2. Вычитать (-) \n" +
        "3. Умножать (*) \n" +
        "4. Делить (/) \n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите операцию: (+  -  *  /) ");
        char operation = scanner.next().charAt(0);

            if (!(operation == '+' || operation == '-' || operation == '*' || operation == 'x' || operation == '/')) {
                System.err.println("Нет такой операции");
            }

        System.out.println("Первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Второе число: ");
        double num2 = scanner.nextDouble();

        if (operation == '/' && num2 == 0.0) {
            System.err.println("SВторое число не может быть нулем.");
        }

        if (operation == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.err.println("Указан недопустимый оператор");
        }
    }
}
