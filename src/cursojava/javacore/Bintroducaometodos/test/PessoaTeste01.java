package cursojava.javacore.Bintroducaometodos.test;

import cursojava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "cadu" ;
        //pessoa.idade = 15;
        pessoa.setIdade(15);
        pessoa.setNome("cadu");

        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }


}
