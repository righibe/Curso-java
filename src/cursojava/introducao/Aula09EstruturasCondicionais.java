package cursojava.introducao;

public class Aula09EstruturasCondicionais {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia){
            case 1 :
                System.out.println("domingo");
                break;
            case 2 :
                System.out.println("segunda");
                break;
            case 3 :
                System.out.println("ter");
                break;
            case 4 :
                System.out.println("qua");
                break;
            case 5 :
                System.out.println("qui");
                break;
            case 6 :
                System.out.println("sex");
                break;
            case 7 :
                System.out.println("sab");
                break;
            default:
                System.out.println("opção inválida");
        }

        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("homem");
                break;
            case 'F': {
                System.out.println("mulher");
                break;
            }
            default:
                System.out.println("invalido");
        }

    }
}
