import java.util.Scanner;

public class Dz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        System.out.printf("сумма от 1 до n равна %s", getSum(n));
        System.out.printf("\nпроизведение от 1 до n равна %s", getComposition(n));
        scanner.close();
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum +=i;
        }
        return sum;
    }
    
    public static int getComposition(int n) {
        int compos = 1;
        for (int i = 1; i <=n; i++) {
            compos *=i;
        }
        return compos;
    }
}
