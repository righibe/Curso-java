package cursojava.javacore.Aintroducaoclasses.teste;

import cursojava.javacore.Aintroducaoclasses.dominio.carro;

public class carroTeste01 {
    public static void main(String[] args) {
        carro carro1 = new carro();
        carro carro2 = new carro();

        carro1.nome= "Fusca Bala";
        carro1.ano = 1969;
        carro1.modelo = "sport";

        carro2.ano = 1980;
        carro2.nome = "Mustang ";
        carro2.modelo = "GT 500";

        System.out.println(carro1.nome);
        System.out.println(carro2.nome);


        System.out.println(carro1.ano);
        System.out.println(carro2.ano);



        System.out.println(carro1.modelo);
        System.out.println(carro2.modelo);
    }
}
