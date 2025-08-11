package cursojava.introducao;
import java.util.Scanner;

public class Aula06EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual sua idade? ");
        float idade = scanner.nextFloat();

        System.out.print("Qual é a seu salário? ");
        float salario = scanner.nextInt();


        int idadeDentroDaLei = 18;
        float salarioDentroDaLei = 3500;

        if (idade >= idadeDentroDaLei && salario >= salarioDentroDaLei) {
            System.out.println("voce esta dentro da lei");
        }else{
            System.out.println("voce nao esta dentro da lei");
        }
        int anosDeIdade = 30;
        String categoria;

        if(anosDeIdade<15){
            categoria = "categoria infantil";
        }else if(anosDeIdade >= 15 && anosDeIdade <18){
            categoria = "categoria juvenil";
        }else{
            categoria = "categoria adulto";
        }
        System.out.println(categoria);
    }
}
