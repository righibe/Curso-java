package cursojava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];
    private int mediaSalario;

    public void ImprimeMediaSalario(){

        for (double salario : salarios){
            mediaSalario += salario;
        }
        System.out.println(mediaSalario /salarios.length);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMediaSalario() {
        return mediaSalario;
    }

}
