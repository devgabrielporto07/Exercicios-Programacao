// IntelliJ:
package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class SalarioComBonus {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String name_Vendendor = scanner.next();
        double salario_Fixo = scanner.nextDouble();
        double total_Devendas = scanner.nextDouble();
        final double comissao_Vendas = 0.15; // comissão de vendas de 15%
         double total_Mes = (total_Devendas*comissao_Vendas) + salario_Fixo;
         System.out.printf ("TOTAL = R$ %.2f\n", total_Mes);
    }
}

// Terminal do Beecrowd:
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        String name_Vendendor = scanner.next();
        double salario_Fixo = scanner.nextDouble();
        double total_Devendas = scanner.nextDouble();
        final double comissao_Vendas = 0.15; // 15%
        double total_Mes = (total_Devendas*comissao_Vendas) + salario_Fixo;
        System.out.printf ("TOTAL = R$ %.2f\n", total_Mes);
    }
}