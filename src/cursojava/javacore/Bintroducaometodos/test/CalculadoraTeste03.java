package cursojava.javacore.Bintroducaometodos.test;

import cursojava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(10, 0);
        System.out.println(result);

        System.out.println(calculadora.divideDoisNumeros02DS(15 , 0));
        System.out.println("________________________________");


        calculadora.imprimeDivisaoDeDoisnumeros(10,30);

    }
}
