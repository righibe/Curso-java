package cursojava.introducao;

public class Aula14EstruturasDeRepeticao {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for(int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("parcela " + parcela + " R$ " + valorParcela);

        }
    }
}
