import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice1Test {

    Exercice1 e = new Exercice1();

    @Test
    void racine_1_a_5() {
        int[] tab = {1,1,1,2,2};
        assertArrayEquals(tab , e.racine(1, 5));
    }
}