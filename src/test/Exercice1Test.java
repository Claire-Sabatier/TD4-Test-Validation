import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercice1Test {


    protected Exercice1 e;

    @Before
    public void setUp() {
        e = new Exercice1();
    }

    @Test
    public void racine_1_a_5() {
        int[] tab = {1,1,1,2,2};
        assertArrayEquals(tab , e.racine(1, 5));
    }

    @Test
    public void a_inf_b(){
        try {
            e.racine(6, 3);
            Assert.fail("Racine devrait lancer une exception");
        } catch (Exception exc) {
            // Rien dans le catch puisque c'est le comportement attendu.
        }
    }

}
