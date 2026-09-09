// IntelliJ | NetBeans | Eclipse

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class NumerosPositivos {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int number_positives = 0;
        for (int loop = 1; loop <= 6; loop ++) {
            double numbers_users = scanner.nextDouble();
            if (numbers_users > 0) {
                number_positives += 1;
            }
        }
        System.out.println (number_positives + " valores positivos");
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
        int number_positives = 0;
        for (int loop = 1; loop <= 6; loop ++) {
            double number_users = scanner.nextDouble();
            if (number_users > 0) {
                number_positives += 1;
            }
        }
        System.out.println (number_positives + " valores positivos");
        scanner.close();
    }
}