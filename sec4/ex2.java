import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double raio, area, pi = 3.14159;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do raio: ");
        raio = sc.nextDouble();

        area = pi * (raio * raio);

        System.out.printf("A area do circulo eh: %.4f", area);
        sc.close();
    }
}
