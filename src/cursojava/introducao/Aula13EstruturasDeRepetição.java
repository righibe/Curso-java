package cursojava.introducao;
import java.util.Scanner;

public class Aula13EstruturasDeRepetição {
    // dado o valor de um carro, descubra quantas vezes ele pode ser paracelado
    // condicao da parcela >= 1000
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("fale o valor do carro:");
        double valorCarro = scanner.nextDouble();

        System.out.println("em quantas vezes quer parcelar?");
        float valorParcela = scanner.nextFloat();

        double calculoValorParcela = valorCarro/1000;
        double valorCorretoParcela = valorCarro/valorParcela;

        int maxParcelas = (int)(valorCarro / 1000);

        if (calculoValorParcela >= valorParcela){
            System.out.println("Parabens você orçou o parcelamento de um carro!, cada parcela ficou no valode:" + valorCorretoParcela + " !!!");
        }
        else {
            System.out.println("O número de parcelas escolhidas é muito grande, eis a tabela de quantas vezes pode parcelar o carro:");
            for (int i = 1; i <= maxParcelas; i++) {
                double tabelaParcela = valorCarro / i;
                System.out.printf( "\n" + i + " parcelas de R$ %.2f", tabelaParcela);
            }

        scanner.close();

        }


    }
}
