// IntelliJ || NetBeans || Eclipse:

package desafiosbeecrowd;
import java.util.Scanner;
import java.util.Locale;
public class ParesEntreCincoNumeros {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int quantidade_pares = 0;
        for (int loop = 1; loop <= 5; loop++) {
            int valores_users = scanner.nextInt();
            if (valores_users % 2 == 0) {
               quantidade_pares++;
            }
        }
        System.out.println(quantidade_pares + " valores pares");
        scanner.close();
    }
}

// Terminal Beecrwod:

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int quantidade_pares = 0;
        for (int loop = 1; loop <= 5; loop++) {
            int valores_users = scanner.nextInt();
            if (valores_users % 2 == 0) {
                quantidade_pares++;
            }
        }
        System.out.println (quantidade_pares + " valores pares");
        scanner.close();
    }
}