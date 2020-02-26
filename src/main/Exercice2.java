import java.util.Random;

public class Exercice2 {



    public int[][] matrice (int m, int n, int a, int b){
        int[][] tab = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n ; j++){
                Random r = new Random();
                int valeur = a + r.nextInt(b - a);
                tab[i][j] = valeur;
            }
        }
        return tab;
    }

    public static void main(String[] args){
        Exercice2 e = new Exercice2();
        int [][] tab = e.matrice(5, 5, 2, 6);
        for (int[] t : tab){
            for (int tt : t){
                System.out.print(tt);
            }
            System.out.println();
        }
    }
}
