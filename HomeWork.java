import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, p;
        double m1, m2, G;

        System.out.println("Введите a: ");
        a = scanner.nextInt();
        System.out.println("Введите p: ");
        p = scanner.nextInt();
        System.out.println("Введите m1: ");
        m1 = scanner.nextDouble();
        System.out.println("Введите m2: ");
        m2 = scanner.nextDouble();

        G = 4 * Math.pow(Math.PI, 2) * (Math.pow(a, 3) / (Math.pow(p, 2) * (m1 + m2)));
        System.out.println("Ответ: " + G);
    }
}
