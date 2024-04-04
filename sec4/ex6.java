import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double a, b, c, pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de A:");
        a = sc.nextDouble();
        System.out.println("Informe o valor de B:");
        b = sc.nextDouble();
        System.out.println("Informe o valor de C:");
        c = sc.nextDouble();

        System.out.printf("Triangulo: %.3f\n", ((a * c) / 2));
        System.out.printf("Circulo: %.3f\n", (pi * (c * c)));
        System.out.printf("Trapezio: %.3f\n", (((a + b) * c) / 2));
        System.out.printf("Quadrado: %.3f\n", (b * b));
        System.out.printf("Retangulo: %.3f", (a * b));
        sc.close();
    }
}
