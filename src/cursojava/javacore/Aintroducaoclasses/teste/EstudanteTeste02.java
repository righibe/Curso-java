package cursojava.javacore.Aintroducaoclasses.teste;

import cursojava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
       Estudante estudante = new Estudante();
       Estudante estudante2 = new Estudante();

       System.out.println(estudante.idade);
       System.out.println(estudante.sexo);
       System.out.println(estudante.nome);
    }
}
