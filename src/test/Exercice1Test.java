import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice1Test {

    protected Exercice1 e;

    @Before
    public void setUp() {
        e = new Exercice1();
    }

    @Test
    void racine_1_a_5() {
        int[] tab = {1,1,1,2,2};
        assertArrayEquals(tab , e.racine(1, 5));
    }

    @Test
    void a_inf_b(){
        try {
            e.racine(6, 3);
            Assert.fail("Racine devrait lancer une exception");
        } catch (Exception exc) {
            // Rien dans le catch puisque c'est le comportement attendu.
        }
    }

}
