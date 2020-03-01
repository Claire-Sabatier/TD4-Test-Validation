import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercice4Test {
    protected Exercice4 e;
    @Before
    public void setUp() throws Exception {
        e = new Exercice4();
    }

    @Test
    public void triangleIsocele() {
        assertEquals("Triangle isocèle", e.triangle(2,2,1));
    }

    @Test
    public void triangleEquilateral() {
        assertEquals("Triangle équilatéral", e.triangle(2,2,2));
    }

    @Test
    public void triangleScalene() {
        assertEquals("Triangle scalène", e.triangle(2,3,1));
    }
}