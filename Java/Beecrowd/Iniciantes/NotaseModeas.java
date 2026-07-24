// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class NotaseMoedas {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double valor_notas = scanner.nextDouble();
        // NOTAS:
         final int VALOR_100 = 100;
         final int VALOR_50 = 50;
         final int VALOR_20 = 20;
         final int VALOR_10 = 10;
         final int VALOR_5 = 5;
         final int VALOR_2 = 2;
         final int VALOR_1 = 1;
        // MOEDAS:
         final int VALOR_050 = 50;
         final int VALOR_025 = 25;
         final int VALOR_010 = 10;
         final int VALOR_005 = 5;
         final int VALOR_001 = 1;
        // CÁLCULO:
        int valor_notasinteiro = (int) valor_notas;
        double valor_restodecimalnotas = (valor_notas - valor_notasinteiro)*100; // PARTE TRUNCADA
        int valor_conversaorestodecimalnotas = (int) valor_restodecimalnotas; // PARTE TRUNCADA INTEIRA
        int nota_100 = valor_notasinteiro / VALOR_100;
        int nota_50 = (valor_notasinteiro % VALOR_100) / VALOR_50;
        int nota_20 = (valor_notasinteiro % VALOR_100 % VALOR_50) / VALOR_20;
        int nota_10 = (valor_notasinteiro % VALOR_100 % VALOR_50 % VALOR_20) / VALOR_10;
        int nota_5 = (valor_notasinteiro % VALOR_100 % VALOR_50 % VALOR_20 % VALOR_10) / VALOR_5;
        int nota_2 = (valor_notasinteiro % VALOR_100 % VALOR_50 % VALOR_20 % VALOR_10 % VALOR_5) / VALOR_2;
        int moeda_1 = (valor_notasinteiro % VALOR_100 % VALOR_50 % VALOR_20 % VALOR_10 % VALOR_5 % VALOR_2) / VALOR_1;
        int moeda_050 = (valor_conversaorestodecimalnotas / VALOR_050);
        int moeda_025 = (valor_conversaorestodecimalnotas % VALOR_050) / VALOR_025;
        int moeda_010 = (valor_conversaorestodecimalnotas % VALOR_050 % VALOR_025) / VALOR_010;
        int moeda_005 = (valor_conversaorestodecimalnotas % VALOR_050 % VALOR_025 % VALOR_010) / VALOR_005;
        int moeda_001 = (valor_conversaorestodecimalnotas % VALOR_050 % VALOR_025 % VALOR_010 % VALOR_005) / VALOR_001;
        System.out.println ("NOTAS:");
        System.out.println (nota_100 + " nota(s) de R$ 100.00");
        System.out.println (nota_50 + " nota(s) de R$ 50.00");
        System.out.println (nota_20 + " nota(s) de R$ 20.00");
        System.out.println (nota_10 + " nota(s) de R$ 10.00");
        System.out.println (nota_5 + " nota(s) de R$ 5.00");
        System.out.println (nota_2 + " nota(s) de R$ 2.00");
        System.out.println ("MOEDAS:");
        System.out.println (moeda_1 + " moeda(s) de R$ 1.00");
        System.out.println (moeda_050 + " moeda(s) de R$ 0.50");
        System.out.println (moeda_025 + " moeda(s) de R$ 0.25");
        System.out.println (moeda_010 + " moeda(s) de R$ 0.10");
        System.out.println (moeda_005 + " moeda(s) de R$ 0.05");
        System.out.println (moeda_001 + " moeda(s) de R$ 0.01");
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double valor_notas = scanner.nextDouble();
        
        final int VALOR_100 = 100;
        final int VALOR_50 = 50;
        final int VALOR_20 = 20;
        final int VALOR_10 = 10;
        final int VALOR_5 = 5;
        final int VALOR_2 = 2;
        final int VALOR_1 = 1;
        final int VALOR_050 = 50;
        final int VALOR_025 = 25;
        final int VALOR_010 = 10;
        final int VALOR_005 = 5;
        final int VALOR_001 = 1;
        
        int valor_notasinteiro = (int) valor_notas;
        double valor_restodecimalnotas = (valor_notas - valor_notasinteiro)*100; 
        int valor_conversaorestodecimalnotas = (int) valor_restodecimalnotas;
        
        int nota_100 = valor_notasinteiro / VALOR_100;
        int nota_50 = (valor_notasinteiro % VALOR_100) / VALOR_50;
        int nota_20 = (valor_notasinteiro % VALOR_100 % VALOR_50) / VALOR_20;
        int nota_10 = (valor_notasinteiro % VALOR_100 % VALOR_50 % VALOR_20) / VALOR_10;
        int nota_5 = (valor_notasinteiro % VALOR_100 % VALOR_50 % VALOR_20 % VALOR_10) / VALOR_5;
        int nota_2 = (valor_notasinteiro % VALOR_100 % VALOR_50 % VALOR_20 % VALOR_10 % VALOR_5) / VALOR_2;
        int moeda_1 = (valor_notasinteiro % VALOR_100 % VALOR_50 % VALOR_20 % VALOR_10 % VALOR_5 % VALOR_2) / VALOR_1;
        int moeda_050 = (valor_conversaorestodecimalnotas / VALOR_050);
        int moeda_025 = (valor_conversaorestodecimalnotas % VALOR_050) / VALOR_025;
        int moeda_010 = (valor_conversaorestodecimalnotas % VALOR_050 % VALOR_025) / VALOR_010;
        int moeda_005 = (valor_conversaorestodecimalnotas % VALOR_050 % VALOR_025 % VALOR_010) / VALOR_005;
        int moeda_001 = (valor_conversaorestodecimalnotas % VALOR_050 % VALOR_025 % VALOR_010 % VALOR_005) / VALOR_001;
        
        System.out.println ("NOTAS:");
        System.out.println (nota_100 + " nota(s) de R$ 100.00");
        System.out.println (nota_50 + " nota(s) de R$ 50.00");
        System.out.println (nota_20 + " nota(s) de R$ 20.00");
        System.out.println (nota_10 + " nota(s) de R$ 10.00");
        System.out.println (nota_5 + " nota(s) de R$ 5.00");
        System.out.println (nota_2 + " nota(s) de R$ 2.00");
        System.out.println ("MOEDAS:");
        System.out.println (moeda_1 + " moeda(s) de R$ 1.00");
        System.out.println (moeda_050 + " moeda(s) de R$ 0.50");
        System.out.println (moeda_025 + " moeda(s) de R$ 0.25");
        System.out.println (moeda_010 + " moeda(s) de R$ 0.10");
        System.out.println (moeda_005 + " moeda(s) de R$ 0.05");
        System.out.println (moeda_001 + " moeda(s) de R$ 0.01");
    }
}