// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays; // Manipular Arrays nos precisamos importa .sort ArrayList mas array por si é uma estrutura de dados padrão
// classe utilitária (utilizar ferramentas prontas nos importamos para não escrever o código todo denovo)
public class SortSimples {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int valor_1 = scanner.nextInt();
        int valor_2 = scanner.nextInt();
        int valor_3 = scanner.nextInt();
        int [] valores = {valor_1, valor_2, valor_3};
        Arrays.sort(valores);
        System.out.println (valores [0]);
        System.out.println (valores [1]);
        System.out.println (valores [2]);
        System.out.println (""); // como se fosse um \n 
        System.out.println (valor_1);
        System.out.println (valor_2);
        System.out.println (valor_3);
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int valor_1 = scanner.nextInt();
        int valor_2 = scanner.nextInt();
        int valor_3 = scanner.nextInt();
        int [] valores = {valor_1, valor_2, valor_3};
        Arrays.sort(valores);
        System.out.println (valores [0]);
        System.out.println (valores [1]);
        System.out.println (valores [2]);
        System.out.println ("");
        System.out.println (valor_1);
        System.out.println (valor_2);
        System.out.println (valor_3);
    }
}