package cursojava.javacore.Bintroducao.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println((float) 10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(20-7);
    }



    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);

    }

    public double divideDoisNumeros(double num1, double num2 ){
        return num1/num2;
    }
}