// IntelliJ || NetBeans || Eclipse:

package desafiosbeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class ParesImparesPositivosNegativos {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int paresNumbers = 0;
        int imparesNumbers = 0;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        for (int loop = 1; loop <= 5; loop++) {
            int numbersEntrance = scanner.nextInt();
            if (numbersEntrance % 2 == 0) {
                paresNumbers ++;
            }
            if (numbersEntrance % 2 == 1 || numbersEntrance % 2 == -0.01) {
                imparesNumbers++;
            }
            if (numbersEntrance > 0) {
                positiveNumbers++;
            }
            if (numbersEntrance < 0) {
                negativeNumbers++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", paresNumbers);
        System.out.printf("%d valor(es) impar(es)\n", imparesNumbers);
        System.out.printf("%d valor(es) positivo(s)\n", positiveNumbers);
        System.out.printf("%d valor(es) negativo(s)\n", negativeNumbers);
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int paresNumbers = 0;
        int imparesNumbers = 0;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        for (int loop = 1; loop <= 5; loop++) {
            int numbersEntrance = scanner.nextInt();
            if (numbersEntrance % 2 == 0) {
                paresNumbers ++;
            }
            if (numbersEntrance % 2 == 1 || numbersEntrance % 2 == -0.01) {
                imparesNumbers++;
            }
            if (numbersEntrance > 0) {
                positiveNumbers++;
            }
            if (numbersEntrance < 0) {
                negativeNumbers++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", paresNumbers);
        System.out.printf("%d valor(es) impar(es)\n", imparesNumbers);
        System.out.printf("%d valor(es) positivo(s)\n", positiveNumbers);
        System.out.printf("%d valor(es) negativo(s)\n", negativeNumbers);
    }
}