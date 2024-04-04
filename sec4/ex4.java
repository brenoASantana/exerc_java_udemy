import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int numFun;
        float porHora, horasTrab;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu numero de funcionario:");
        numFun = sc.nextInt();
        System.out.println("Informe o valor que recebe por hora:");
        porHora = sc.nextFloat();
        System.out.println("Informe o valor que recebe por hora:");
        horasTrab = sc.nextFloat();

        System.out.printf("Numero: %d \nSalario: U$ %.2f", numFun, (porHora * horasTrab));

        sc.close();
    }
}
