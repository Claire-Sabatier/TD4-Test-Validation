public class Exercice3 {


    public boolean estPalindrome(String mot){
        StringBuilder m = new StringBuilder(mot);
        StringBuilder inverse = m.reverse();
        return inverse.toString().equals(mot);
    }
    public int nbPalyndrome(String phrase){
        int nb = 0;

        String[] mots = phrase.split(" ");
        for (String m: mots) {
            if(estPalindrome(m)){
                nb++;
            }
        }

        return nb;
    }


    public static void main(String[] args){
        Exercice3 e = new Exercice3();

        System.out.println(e.nbPalyndrome("elle non"));
    }
}
