package cursojava.javacore.Bintroducaometodos.test;

import cursojava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("bernardo");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double []{200.00, 200.0 , 200});
        funcionario.ImprimeMediaSalario();
    }
}
