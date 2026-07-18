// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class IdadeEmDias {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        final int quantidade_DiasAno = 365;
        final int quantidade_DiasMes = 30;
        int idade_Em_Dias = scanner.nextInt();
        int idade_Em_Ano = idade_Em_Dias / quantidade_DiasAno;
        int idade_Em_Mes = (idade_Em_Dias % quantidade_DiasAno) / quantidade_DiasMes;
        int idade_Resto_Dias = (idade_Em_Dias % quantidade_DiasAno) % quantidade_DiasMes;
        System.out.println (idade_Em_Ano +" ano(s)");
        System.out.println (idade_Em_Mes +" mes(es)");
        System.out.println (idade_Resto_Dias +" dia(s)");
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        final int quantidade_DiasAno = 365;
        final int quantidade_DiasMes = 30;
        int idade_Em_Dias = scanner.nextInt();
        int idade_Em_Ano = idade_Em_Dias / quantidade_DiasAno; 
        int idade_Em_Mes = (idade_Em_Dias % quantidade_DiasAno) / quantidade_DiasMes;
        int idade_Resto_Dias = (idade_Em_Dias % quantidade_DiasAno) % quantidade_DiasMes;
        System.out.println (idade_Em_Ano +" ano(s)");
        System.out.println (idade_Em_Mes +" mes(es)");
        System.out.println (idade_Resto_Dias +" dia(s)");
    }
}