package cursojava.javacore.Bintroducaometodos.test;
import java.util.Scanner;

import cursojava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        //pessoa.nome = "cadu" ;
        //pessoa.idade = 15;


        System.out.print("Qual seu nome? ");
        String nome = scanner.next();
        pessoa.setNome(nome);


        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();
        pessoa.setIdade(idade);



        System.out.print("Qual seu sobrenome? ");
        String sobrenome = scanner.next();
        pessoa.setSobrenome(sobrenome);

        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getSobrenome());
    }


}
