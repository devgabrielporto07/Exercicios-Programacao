// IntelliJ | NetBeans | Eclipse

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class PositivoseMedias {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        final double quantity_value = 6;
        double media = 0;
        int value_positive = 0;
        double sum_value = 0;
        for (int loop = 1; loop <= 6; loop++) {
            double value_entry = scanner.nextDouble();
            if (value_entry > 0) {
                value_positive += 1;
                sum_value += value_entry;
            }
        }
        System.out.println (value_positive + "valores positivos");
        media = (double) sum_value / value_positive;
        System.out.printf ("%.1f\n", media);
        scanner.close ();
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        final double quantity_value = 6;
        double media = 0;
        int value_positive = 0;
        double sum_value = 0;
        for (int loop = 1; loop <= 6; loop++) {
            double value_entry = scanner.nextDouble();
            if (value_entry > 0) {
                value_positive += 1;
                sum_value += value_entry;
            }
        }
        System.out.println (value_positive + " valores positivos");
        media = (double) sum_value / value_positive;
        System.out.printf ("%.1f\n", media);
        scanner.close ();
    }
}