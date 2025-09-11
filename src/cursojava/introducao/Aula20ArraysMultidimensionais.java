package cursojava.introducao;

public class Aula20ArraysMultidimensionais {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];
        arrayInt[0] =new int[8];
        arrayInt[1] =new int[3];
        arrayInt[2] =new int[3];

        for(int[] arrayBase : arrayInt){
            for (int num : arrayBase){
                System.out.println(num);
            }
        }
    }
}
