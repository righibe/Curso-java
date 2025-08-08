package cursojava.introducao;
import java.util.Scanner;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01/numero02;
        System.out.println(resultado);

        int resto = 21 % 7;
        System.out.println(resto);

        boolean DezMaioQue20 = 10 > 20;
        boolean DezMenorQue20 = 10 < 20;
        boolean DezIgual20 = 10 == 20;
        boolean DezIgual10 = 10 == 10;
        boolean DezDiferenteDe20 = 10 != 20;
        boolean DezDiferenteDe10 = 10 != 20;

        System.out.println("dez é maior que 20? " + DezMaioQue20);
        System.out.println("dez é menor que 20? " + DezMenorQue20);
        System.out.println("dez é igual a 20? " + DezIgual20);
        System.out.println("dez é igual a dez?" + DezIgual10);
        System.out.println("dez é diferente de 20? " + DezDiferenteDe20);
        System.out.println("dez é diferente de 10?" + DezDiferenteDe10);

        // && (AND) || (or) !  (not)
        int idadeReal = 35;
        float salariorReal = 3500F;

        boolean maiorDentroDaLei = idadeReal > 30 && salariorReal >= 4612;
        boolean menorDentroDaLei = idadeReal < 30 && salariorReal >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + maiorDentroDaLei);
        System.out.println("isDentroDaLeiMenorQueTrinta " + menorDentroDaLei);


    }
}
