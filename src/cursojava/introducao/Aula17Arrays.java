package cursojava.introducao;

public class Aula17Arrays {
    public static void main(String[] args) {
        int [] numeros = new int [3];
        int [] numeros2 = {1,2,3,4,5};
        int [] numeros3 = new int[] {1,2,3,4,5};

        for (int i = 0; i < numeros3.length; i++){
            if (i == 4){
                System.out.println("esse numero de cima é bacana");
            }
            System.out.println(numeros3[i]);
        }


        System.out.println("////////////////");



        for(int num:numeros3){
            System.out.println(num);
        }

    }
}
