package cursojava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void ImprimeMediaSalario(){
        double somaSalario = 0;
        for (double salario : salarios){
            somaSalario += salario;
        }
        System.out.println(somaSalario/salarios.length);
    }
}
