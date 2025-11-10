package cursojava.javacore.Bintroducaometodos.test;

import cursojava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Bernardo";
        funcionario.idade = 18;
        funcionario.salarios = new double []{2500.0 , 2500.00 , 2250};
        funcionario.ImprimeMediaSalario();
    }
}
