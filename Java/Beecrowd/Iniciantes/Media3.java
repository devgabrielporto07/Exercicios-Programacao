// IntelliJ:
// Se você usar o double nesse desafio vai dar uma pequena distorção na media por casua do tamanho 8btyes
// Enqunato o float é a metade disso 4bytes, trabalhar com números decimais é complicado essas imprecisões do pc
package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Media3 {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        float number3 = scanner.nextFloat();
        float number4 = scanner.nextFloat();
        final float PESO_1 = 2f;
        final float PESO_2 = 3f;
        final float PESO_3 = 4f;
        final float PESO_4 = 1f;
        final float SOMA_PESOS = 10f;
        float Media_Numbers_Peso = ((number1*PESO_1) + (number2*PESO_2) + (number3 * PESO_3) + (number4 * PESO_4)) / (SOMA_PESOS);
        System.out.printf("Media: %.1f\n", Media_Numbers_Peso);
        if (Media_Numbers_Peso >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (Media_Numbers_Peso < 5) {
            System.out.println("Aluno reprovado.");
        } else if (Media_Numbers_Peso >= 5 && Media_Numbers_Peso <= 6.9) {
            System.out.println("Aluno em exame.");
            float Nota_Exame = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", Nota_Exame);
            float Media_Final = (Nota_Exame + Media_Numbers_Peso) / 2;
            if (Media_Final >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", Media_Final);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", Media_Final);
            }
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
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        float number3 = scanner.nextFloat();
        float number4 = scanner.nextFloat();
        final float PESO_1 = 2f;
        final float PESO_2 = 3f;
        final float PESO_3 = 4f;
        final float PESO_4 = 1f;
        final float SOMA_PESOS = 10f;
        float Media_Numbers_Peso = ((number1*PESO_1) + (number2*PESO_2) + (number3*PESO_3) + (number4*PESO_4)) / (SOMA_PESOS);
        System.out.printf ("Media: %.1f%n", Media_Numbers_Peso);
        if (Media_Numbers_Peso >= 7) {
            System.out.println ("Aluno aprovado.");
        }
        else if (Media_Numbers_Peso < 5) {
            System.out.println ("Aluno reprovado.");
        }
        else if (Media_Numbers_Peso >= 5 && Media_Numbers_Peso <= 6.9) {
            System.out.println ("Aluno em exame.");
            float Nota_Exame = scanner.nextFloat();
            System.out.printf ("Nota do exame: %.1f%n", Nota_Exame);
            float Media_Final = (Nota_Exame + Media_Numbers_Peso) / 2;
            if (Media_Final >= 5) {
                System.out.println ("Aluno aprovado.");
                System.out.printf ("Media final: %.1f%n", Media_Final);
            }
            else {
                System.out.println ("Aluno reprovado.");
                System.out.printf ("Media final: %.1f%n", Media_Final);
            }
        }
        scanner.close();
    }
}