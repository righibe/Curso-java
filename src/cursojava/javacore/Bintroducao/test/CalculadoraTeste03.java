package cursojava.javacore.Bintroducao.test;

import cursojava.javacore.Bintroducao.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(10 , 2);
        System.out.println(result);
    }
}
