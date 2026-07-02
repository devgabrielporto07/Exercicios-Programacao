// IntelliJ:

package desafiosbeecrowd;
import java.util.Scanner;
import java.util.Locale;
public class ProdutoSimples {
    public static void main (String[]args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int valor_Um = scanner.nextInt();
        int valor_Dois = scanner.nextInt();
        int produto_Simples = valor_Um*valor_Dois;
        System.out.println ("PROD = " + produto_Simples);
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int valor_Um = scanner.nextInt(); 
        int valor_Dois = scanner.nextInt();
        int produto_Simples = valor_Um*valor_Dois;
        System.out.println ("PROD = " + produto_Simples);
    }
}