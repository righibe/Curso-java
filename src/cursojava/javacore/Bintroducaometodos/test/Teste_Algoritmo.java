package cursojava.javacore.Bintroducaometodos.test;

import cursojava.javacore.Bintroducaometodos.dominio.Teste_Algoritmos;

public class Teste_Algoritmo {
    public static void main(String[] args) {
        Teste_Algoritmos calculadora = new Teste_Algoritmos();
        int num1 = 14;
        int num2 = 20;
        int result = calculadora.calculator(1,2);
        System.out.println(result);
    }
}
