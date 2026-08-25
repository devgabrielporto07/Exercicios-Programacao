// IntelliJ || NetBeans || Eclipse

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class ImpostodeRenda {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        double salario_Pessoa_Lisarb = scanner.nextDouble(); // Renda
        final double taxa_8 = 0.08; // Imposto de Renda
        final double taxa_18 = 0.18; // Imposto de Renda
        final double taca_28 = 0.28; // Imposto de Renda
        if (salario_Pessoa_Lisarb >= 0.00 && salario_Pessoa_Lisarb <= 2000.00) {
            System.out.println ("Isento");
        }
        else if (salario_Pessoa_Lisarb >= 2000.01 && salario_Pessoa_Lisarb <= 3000.00) {
            double imposto_renda = (salario_Pessoa_Lisarb - 2000) * 0.08;
            System.out.printf ("R$ %.2f\n", imposto_renda);
        }
        else if (salario_Pessoa_Lisarb >= 3000.01 && salario_Pessoa_Lisarb <= 4500.00) {
            double imposto_renda = (1000 * 0.08) + ((salario_Pessoa_Lisarb - 3000) * 0.18);
            System.out.printf ("R$ %.2f\n",  imposto_renda);
        }
        else if (salario_Pessoa_Lisarb > 4500.00) {
            double imposto_renda = (1000 * 0.08) + (1500 * 0.18) + ((salario_Pessoa_Lisarb - 4500) * 0.28);
            System.out.printf ("R$ %.2f\n",  imposto_renda);
        }
        scanner.close();
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double salario_Pessoa_Lisarb = scanner.nextDouble();
        final double taxa_8 = 0.08; 
        final double taxa_18 = 0.18; 
        final double taca_28 = 0.28; 
        if (salario_Pessoa_Lisarb >= 0.00 && salario_Pessoa_Lisarb <= 2000.00) {
            System.out.println ("Isento");
        }
        else if (salario_Pessoa_Lisarb >= 2000.01 && salario_Pessoa_Lisarb <= 3000.00) {
            double imposto_renda = (salario_Pessoa_Lisarb - 2000) * 0.08;
            System.out.printf ("R$ %.2f\n", imposto_renda);
        }
        else if (salario_Pessoa_Lisarb >= 3000.01 && salario_Pessoa_Lisarb <= 4500.00) {
            double imposto_renda = (1000 * 0.08) + ((salario_Pessoa_Lisarb - 3000) * 0.18);
            System.out.printf ("R$ %.2f\n",  imposto_renda);
        }
        else if (salario_Pessoa_Lisarb > 4500.00) {
            double imposto_renda = (1000 * 0.08) + (1500 * 0.18) + ((salario_Pessoa_Lisarb - 4500) * 0.28);
            System.out.printf ("R$ %.2f\n",  imposto_renda);
        }
        scanner.close();
    }
}