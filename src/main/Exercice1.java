public class Exercice1 {
    public Exercice1() {
    }

    public int[] racine(int A, int B) {
        int dim = B - A + 1;
        int[] res = new int[dim];

        if (A < B) {
            for(int j = A; j <= B; j++) {
                res[j-1] = (int) Math.floor(Math.sqrt((double) j));


            }
        }

        return res;
    }

    public static void main(String[] args) {
        Exercice1 e = new Exercice1();
        int[] tab = e.racine(1, 5);
        int[] var3 = tab;
        int var4 = tab.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int t = var3[var5];
            System.out.println(t);
        }

    }
}