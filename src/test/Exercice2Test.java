import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercice2Test {
    protected Exercice2 e;

    @Before
    public void setUp() throws Exception {
        e = new Exercice2();
    }

    @Test
    public void compris_entreAetB() {
        for (int[] tab : e.matrice(5,5,2,6)){
            for (int t: tab) {

                     assertTrue(t>=2 && t<=6);
            }
        }
    }

    @Test
    public void tailleMatrice() {
        int[][] tab = e.matrice(5,5,2,6);
        assertTrue(tab.length == 5);

    }
}