import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("Informe o valor de A:");
        a = sc.nextInt();
        System.out.println("Informe o valor de B:");
        b = sc.nextInt();
        System.out.println("Informe o valor de C:");
        c = sc.nextInt();
        System.out.println("Informe o valor de D:");
        d = sc.nextInt();

        System.out.printf("Diferenca = %d", ((a * b) - (c * d)));
        sc.close();
    }
}
