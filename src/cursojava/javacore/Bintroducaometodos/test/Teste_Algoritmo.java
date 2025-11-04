package cursojava.javacore.Bintroducaometodos.test;

import cursojava.javacore.Bintroducaometodos.dominio.Teste_Algoritmos;

public class Teste_Algoritmo {
    public static void main(String[] args) {
        Teste_Algoritmos calculadora = new Teste_Algoritmos();
        int num1 = 14;
        int num2 = 20;
        double result = calculadora.calculator(num1,num2);
        System.out.println(result);
    }
}
