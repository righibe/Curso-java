package cursojava.introducao;

public class Aula12EstruturasDeRepeticao {
    public static void main(String[] args) {
        float count = 0;
        while(count < 1000000){
            System.out.println("numero " + count);
            count += 2;
        }
        for(int numeros = 0;numeros <= 50; numeros++) {
            if (numeros > 25){
                break;
            }
            System.out.println(numeros);
        }
    }
}
