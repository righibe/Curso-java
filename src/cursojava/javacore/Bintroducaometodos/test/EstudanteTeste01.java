package cursojava.javacore.Bintroducaometodos.test;

import cursojava.javacore.Bintroducaometodos.dominio.Estudante;
import cursojava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Bernardo";
        estudante01.sexo = 'M';
        estudante01.idade = 18;

        estudante02.nome = "Joaquim";
        estudante02.sexo = 'M';
        estudante02.idade = 17;

        impressora.imprime(estudante02);

        impressora.imprime(estudante01);





        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
