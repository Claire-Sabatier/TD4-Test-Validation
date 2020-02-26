public class Exercice4 {

    public String triangle (int a, int b, int c){
        if(a == b || a == c || c == b ){
            return "Triangle isocèle";
        }
        else if(a == b && a == c && b ==c){
            return "Triangle équilatéral";
        }
        else {return "Triangle scalène";}

    }

}
