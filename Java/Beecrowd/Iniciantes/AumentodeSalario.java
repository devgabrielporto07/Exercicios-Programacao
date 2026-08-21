// IntelliJ:
package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class AumentodeSalario {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double salario_Funcionario = scanner.nextDouble();
        final double taxa_15i = 1.15; // fator de aumento (1 + i);
        final double taxa_12i = 1.12;
        final double taxa_10i = 1.10;
        final double taxa_7i = 1.07;
        final double taxa_4i = 1.04;

        if (salario_Funcionario >= 0 && salario_Funcionario <= 400) {
            double reajuste = (salario_Funcionario*taxa_15i) - salario_Funcionario;
            double novo_Salario = salario_Funcionario*taxa_15i;
            System.out.printf ("Novo salario: %.2f\n", novo_Salario);
            System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
            System.out.println ("Em percentual: 15 %");
        }
        else if (salario_Funcionario >= 400.01 && salario_Funcionario <= 800) {
            double reajuste = (salario_Funcionario*taxa_12i) - salario_Funcionario;
            double novo_Salario = salario_Funcionario*taxa_12i;
            System.out.printf ("Novo salario: %.2f\n", novo_Salario);
            System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
            System.out.println ("Em percentual: 12 %");
        }
        else if (salario_Funcionario >= 800.01 && salario_Funcionario <= 1200) {
            double reajuste = (salario_Funcionario*taxa_10i) - salario_Funcionario;
            double novo_Salario = salario_Funcionario*taxa_10i;
            System.out.printf ("Novo salario: %.2f\n", novo_Salario);
            System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
            System.out.println ("Em percentual: 10 %");
        }
        else if (salario_Funcionario >= 1200.01 && salario_Funcionario <= 2000) {
            double reajuste = (salario_Funcionario*taxa_7i) - salario_Funcionario;
            double novo_Salario = salario_Funcionario*taxa_7i;
            System.out.printf ("Novo salario: %.2f\n", novo_Salario);
            System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
            System.out.println ("Em percentual: 7 %");
        }
        else {
            double reajuste = (salario_Funcionario*taxa_4i) - salario_Funcionario;
            double novo_Salario = salario_Funcionario*taxa_4i;
            System.out.printf ("Novo salario: %.2f\n", novo_Salario);
            System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
            System.out.println ("Em percentual: 4 %");
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
        double salario_Funcionario = scanner.nextDouble();
        final double taxa_15i = 1.15; 
        final double taxa_12i = 1.12;
        final double taxa_10i = 1.10;
        final double taxa_7i = 1.07;
        final double taxa_4i = 1.04;
        
        if (salario_Funcionario >= 0 && salario_Funcionario <= 400) {
        double reajuste = (salario_Funcionario*taxa_15i) - salario_Funcionario;
        double novo_Salario = salario_Funcionario*taxa_15i;
        System.out.printf ("Novo salario: %.2f\n", novo_Salario);
        System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
        System.out.println ("Em percentual: 15 %");
        }
        else if (salario_Funcionario >= 400.01 && salario_Funcionario <= 800) {
        double reajuste = (salario_Funcionario*taxa_12i) - salario_Funcionario;
        double novo_Salario = salario_Funcionario*taxa_12i;
        System.out.printf ("Novo salario: %.2f\n", novo_Salario);
        System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
        System.out.println ("Em percentual: 12 %");
        }
        else if (salario_Funcionario >= 800.01 && salario_Funcionario <= 1200) {
        double reajuste = (salario_Funcionario*taxa_10i) - salario_Funcionario;
        double novo_Salario = salario_Funcionario*taxa_10i;
        System.out.printf ("Novo salario: %.2f\n", novo_Salario);
        System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
        System.out.println ("Em percentual: 10 %");
        }
        else if (salario_Funcionario >= 1200.01 && salario_Funcionario <= 2000) {
        double reajuste = (salario_Funcionario*taxa_7i) - salario_Funcionario;
        double novo_Salario = salario_Funcionario*taxa_7i;
        System.out.printf ("Novo salario: %.2f\n", novo_Salario);
        System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
        System.out.println ("Em percentual: 7 %");
        }
        else {
        double reajuste = (salario_Funcionario*taxa_4i) - salario_Funcionario;
        double novo_Salario = salario_Funcionario*taxa_4i;
        System.out.printf ("Novo salario: %.2f\n", novo_Salario);
        System.out.printf ("Reajuste ganho: %.2f\n", reajuste);
        System.out.println ("Em percentual: 4 %");
        }
        scanner.close();
    }
}