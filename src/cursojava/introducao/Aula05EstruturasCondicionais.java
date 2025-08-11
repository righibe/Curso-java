package cursojava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 25;
        boolean podeComprarBebida = idade >= 18;
        if(podeComprarBebida) {
            System.out.println("dentro da lei");
        }
        if(podeComprarBebida) {
            System.out.println("voce pode comprar bebida");
        }else{
            System.out.println("voce nao pode comprar bebida");
        }
        boolean c = true;
        if (c = false);{
            System.out.println("vai da print nao");
        }
        System.out.println("fora do if");

    }
}
