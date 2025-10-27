package cursojava.javacore.Bintroducao.test;
import cursojava.javacore.Bintroducao.dominio.Calculadora;
import java.util.Scanner;
public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero;
        int numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("dois numeros");
        numero = scanner.nextInt();
        numero2 = scanner.nextInt();
        calculadora.multiplicaDoisNumeros(numero , numero2);
    }
}
 