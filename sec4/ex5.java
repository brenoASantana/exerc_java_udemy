import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int id_p1, quant_p1, id_p2, quant_p2;
        float valorUnit_p1, valorUnit_p2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ID da primeira peça:");
        id_p1 = sc.nextInt();
        System.out.println("Informe a quantidade da primeira peça:");
        quant_p1 = sc.nextInt();
        System.out.println("Informe o valor unitario da primeira peça:");
        valorUnit_p1 = sc.nextFloat();
        System.out.println("Informe o ID da segunda peça:");
        id_p2 = sc.nextInt();
        System.out.println("Informe a quantidade da segunda peça:");
        quant_p2 = sc.nextInt();
        System.out.println("Informe o valor unitario da segunda peça");
        valorUnit_p2 = sc.nextFloat();

        System.out.printf("Valor a pagar: R$%.2f", ((quant_p1 * valorUnit_p1) + (quant_p2 * valorUnit_p2)));

        sc.close();
    }
}
