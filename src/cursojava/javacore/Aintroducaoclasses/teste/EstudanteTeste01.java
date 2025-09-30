package cursojava.javacore.Aintroducaoclasses.teste;

import cursojava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Bernardo";
        estudante.idade = 30;
        estudante.sexo = 'M';
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
    }
}
