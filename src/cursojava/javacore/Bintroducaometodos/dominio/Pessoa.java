package cursojava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private String sobrenome;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sobrenome);
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){

        this.idade = idade;
        if (idade <= 0 ) {
            System.out.println("IDADE INVALIDA");
            return;
        }else if(idade <=18){
            System.out.println("VOCÊ É MENOR DE IDADE!!!");
            return;
        }else{
            System.out.println("VOCÊ É MAIOR DE IDADE! ");
            return;
        }

    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

}
