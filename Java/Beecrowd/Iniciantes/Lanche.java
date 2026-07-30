// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Lanche {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int codigo_Item = scanner.nextInt();
        int quantidade_Item = scanner.nextInt();
        final double CACHORRO_QUENTE1 = 4.00; // Legibilidade
        final double XSALADA2 = 4.50;
        final double XBACON3 = 5.00;
        final double TORRADA_SIMPLES4 = 2.00;
        final double REFRIGERANTE5 = 1.50;
        double total_conta = 0; // Inicialmente não pedimos nada conta 0
        if (codigo_Item == 1) {
            total_conta = quantidade_Item*CACHORRO_QUENTE1;
            System.out.printf ("Total: R$ %.2f\n", total_conta);
        }
        else if (codigo_Item == 2) {
            total_conta = quantidade_Item*XSALADA2;
            System.out.printf ("Total: R$ %.2f\n", total_conta);
        }
        else if (codigo_Item == 3) {
            total_conta = quantidade_Item*XBACON3;
            System.out.printf ("Total: R$ %.2f\n", total_conta);
        }
        else if (codigo_Item == 4) {
            total_conta = quantidade_Item*TORRADA_SIMPLES4;
            System.out.printf ("Total: R$ %.2f\n", total_conta);
        }
        else if (codigo_Item == 5) {
            total_conta = quantidade_Item*REFRIGERANTE5;
            System.out.printf ("Total: R$ %.2f\n", total_conta);
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
        int codigo_Item = scanner.nextInt();
        int quantidade_Item = scanner.nextInt();
        final double CACHORRO_QUENTE1 = 4.00; 
        final double XSALADA2 = 4.50;
        final double XBACON3 = 5.00;
        final double TORRADA_SIMPLES4 = 2.00;
        final double REFRIGERANTE5 = 1.50;
        double total_conta = 0; 
        if (codigo_Item == 1) {
            total_conta = quantidade_Item*CACHORRO_QUENTE1;
            System.out.printf ("Total: R$ %.2f\n", total_conta);
        }
        else if (codigo_Item == 2) {
            total_conta = quantidade_Item*XSALADA2;
            System.out.printf ("Total: R$ %.2f\n", total_conta);
        }
        else if (codigo_Item == 3) {
            total_conta = quantidade_Item*XBACON3;
            System.out.printf ("Total: R$ %.2f\n", total_conta);
        }
        else if (codigo_Item == 4) {
            total_conta = quantidade_Item*TORRADA_SIMPLES4;
            System.out.printf ("Total: R$ %.2f\n", total_conta);
        }
        else if (codigo_Item == 5) {
            total_conta = quantidade_Item*REFRIGERANTE5;
            System.out.printf ("Total: R$ %.2f\n", total_conta);
        }
        scanner.close();
    }
}