package cursojava.introducao;

public class Aula16Arrays {
    public static void main(String[] args) {
        String [] nomes = new String[4];
        nomes[0] = "Bernardo";
        nomes[1] = "Anna";
        nomes[2] = "Cristal";
        nomes[3] = "Doutor";

        for(int i = 0; i < 4; i++){
            System.out.println(nomes[i]);
        }
    }
}
