package cursojava.javacore.Bintroducao.test;
import cursojava.javacore.Bintroducao.dominio.Calculadora;
import java.util.Scanner;
public class CalculadoraTeste02 {
    public static void main(String[] args) {
        int numero;
        int numero2;
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        numero2 = scanner.nextInt();
        calculadora.multiplicaDoisNumeros(numero , numero2);
    }
}
 