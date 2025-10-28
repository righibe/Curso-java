package cursojava.javacore.Bintroducaometodos.dominio;

import cursojava.javacore.Bintroducaometodos.test.EstudanteTeste01;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){

        //if (estudante.nome.equals("Bernardo")){
          //  System.out.println("----------------------");
            //System.out.println("Esse sou eu, já sei tudo sobre mim!");
            //return;
        //}



        System.out.println(" ------------------------------------ ");
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        estudante.nome = "GoHAN";


    }
}
