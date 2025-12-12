package cursojava.desafioPaiValidadorDeCpf.teste;
import cursojava.desafioPaiValidadorDeCpf.domain.ValidadorCpf;

import java.util.Scanner;


public class ValidadorTest {
    public static void main(String[] args) {
        Scanner scannerCpf = new Scanner(System.in);
        ValidadorCpf validador = new ValidadorCpf();

        System.out.println("escreva seu CPF neste modelo: XXX.XXX.XXX-XX");
        String cpfdigitado = scannerCpf.nextLine();

        if(validador.validar(cpfdigitado)){
            System.out.println("Seu CPF é válido");
        } else {
            System.out.println("Seu CPF é inválido");
        }
    }
}
