package cursojava.introducao;

public class Aula19ArraysMultidimensionais {
    public static void main(String[] args) {
        int [][] arrayInt = new int [3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[6];
        arrayInt[2][5] = 6;

        int[][] arrayInt2 = {{0,5},{3, 5},{6,4}};
        for(int[] arraybase: arrayInt2){
            for (int num: arraybase){
                System.out.println(num);
            }
        }
    }
}

