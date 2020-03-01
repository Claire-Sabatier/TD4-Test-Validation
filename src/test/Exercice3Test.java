import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercice3Test {

    protected Exercice3 e;

    @Before
    public void setUp() throws Exception {
        e = new Exercice3();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void estPalindrome() {
        assertTrue(e.estPalindrome("kayak"));
    }

    @Test
    public void nbPalyndrome() {
        assertEquals(3, e.nbPalyndrome("bob kayak lol"));
    }
}