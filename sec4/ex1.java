import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Informe o primeiro valor:");
        a = sc.nextInt();
        System.out.println("Informe o segunda valor:");
        b = sc.nextInt();
        System.out.printf("A soma eh: %d", a + b);
        sc.close();
    }
}
