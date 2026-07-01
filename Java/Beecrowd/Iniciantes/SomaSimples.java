// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class SomaSimples {
    public static void main (String[]args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int valor_1 = scanner.nextInt();
        int valor_2 = scanner.nextInt();
        int soma_Simples = valor_1 + valor_2;
        System.out.println ("SOMA = " + soma_Simples);
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int valor_1 = scanner.nextInt();
        int valor_2 = scanner.nextInt();
        int soma_Simples = valor_1 + valor_2;
        System.out.println ("SOMA = " + soma_Simples);
    }
}