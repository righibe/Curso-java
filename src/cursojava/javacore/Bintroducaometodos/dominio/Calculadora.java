package cursojava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println((float) 10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 7);
    }


    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public double divideDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }


    public float divideDoisNumeros02DS(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        System.out.println("Que bom que voce não colocou um zero ali");
        return num1/num2;
    }

    public void imprimeDivisaoDeDoisnumeros(double num1, double num2) {
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);


    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do altera dois numeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);

    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }


}