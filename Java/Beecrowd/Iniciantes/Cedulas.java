// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Cedulas {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int valor_lido = scanner.nextInt();
//        // Constantes em MAIÚSCULO conforme convenção Java
//    private static final int NOTA_100 = 100;
         final int valor_100 = 100;
         final int valor_50 = 50;
         final int valor_20 = 20;
         final int valor_10 = 10;
         final int valor_5 = 5;
         final int valor_2 = 2;
         final int valor_1 = 1;
        int nota_100 = (valor_lido) / valor_100;
        int nota_50 = (valor_lido % valor_100) / valor_50;
        int nota_20 = (valor_lido % valor_100 % valor_50) / valor_20;
        int nota_10 = (valor_lido % valor_100 % valor_50 % valor_20) / valor_10;
        int nota_5 = (valor_lido % valor_100 % valor_50 % valor_20 % valor_10) / valor_5;
        int nota_2 = (valor_lido % valor_100 % valor_50 % valor_20 % valor_10 % valor_5) / valor_2;
        int nota_1 = (valor_lido % valor_100 % valor_50 % valor_20 % valor_10 % valor_5 % valor_2) / valor_1;
        System.out.println (valor_lido);
        System.out.println (nota_100 + " nota(s) de R$ 100,00");
        System.out.println (nota_50 + " nota(s) de R$ 50,00");
        System.out.println (nota_20 + " nota(s) de R$ 20,00");
        System.out.println (nota_10 + " nota(s) de R$ 10,00");
        System.out.println (nota_5 + " nota(s) de R$ 5,00");
        System.out.println (nota_2 + " nota(s) de R$ 2,00");
        System.out.println (nota_1 + " nota(s) de R$ 1,00");
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int valor_lido = scanner.nextInt();
        final int valor_100 = 100;
        final int valor_50 = 50;
        final int valor_20 = 20;
        final int valor_10 = 10;
        final int valor_5 = 5;
        final int valor_2 = 2;
        final int valor_1 = 1;
        int nota_100 = (valor_lido) / valor_100;
        int nota_50 = (valor_lido % valor_100) / valor_50;
        int nota_20 = (valor_lido % valor_100 % valor_50) / valor_20;
        int nota_10 = (valor_lido % valor_100 % valor_50 % valor_20) / valor_10;
        int nota_5 = (valor_lido % valor_100 % valor_50 % valor_20 % valor_10) / valor_5;
        int nota_2 = (valor_lido % valor_100 % valor_50 % valor_20 % valor_10 % valor_5) / valor_2;
        int nota_1 = (valor_lido % valor_100 % valor_50 % valor_20 % valor_10 % valor_5 % valor_2) / valor_1;
        System.out.println (valor_lido);
        System.out.println (nota_100 + " nota(s) de R$ 100,00");
        System.out.println (nota_50 + " nota(s) de R$ 50,00");
        System.out.println (nota_20 + " nota(s) de R$ 20,00");
        System.out.println (nota_10 + " nota(s) de R$ 10,00");
        System.out.println (nota_5 + " nota(s) de R$ 5,00");
        System.out.println (nota_2 + " nota(s) de R$ 2,00");
        System.out.println (nota_1 + " nota(s) de R$ 1,00");
    }
}