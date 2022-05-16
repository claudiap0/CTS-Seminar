package teste;

import clase.Matematica;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {

    private Matematica mate;
    @Before
    public void SetUp(){
        mate = Matematica.getInstance();
    }

    @Test
    public void testSumaCorecta() {
        int rezultatObtinut = mate.suma(7,5);
        assertEquals(12, rezultatObtinut);
    }

    @Test
    public void testRaportCorect() {
        double rezultat = mate.raport(24,6);
        assertEquals(4, rezultat, 0.01);
    }

    @Test
    public void testRaportCorectCuVirgula() {
        double rezultat = mate.raport(24, 11);
        assertEquals(2.18, rezultat, 0.01);
    }

    @Test
    public void testRaportCorectNegative() {
        double rezultat = mate.raport(-24, 11);
        assertEquals(-2.18, rezultat, 0.01);
    }

    @Test
    public void testRaportImpartireZero() {
        try {
            mate.raport(57, 0);
            fail("nu trebuia sa ajunga aici");
        } catch(IllegalArgumentException ert) { }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRaportImpartireZero2() {
        mate.raport(23,0);
    }

    @Test
    public void testRaportImpartireAccesiValoare() {
        assertEquals(1, mate.raport(10, 10), 0.01);
    }

    @Test
    public void testParitate() {
        boolean rezultat = mate.estePar(5);
        assertFalse(rezultat);
        assertTrue(mate.estePar(6));
        assertTrue(mate.estePar(10));
        assertFalse(mate.estePar(3));
    }

    @Test
    public void testNumerePare() {
        assertEquals(4, mate.nNumerePare(4).size());
        assertEquals(2, mate.nNumerePare(2).size());
        assertEquals(9, mate.nNumerePare(9).size());
    }

    @Test
    public void testNumerePare2() {
        assertNull(mate.nNumerePare(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumerePare3() {
        mate.nNumerePare(-2);
    }

    @Test
    public void testSingleton() {
        assertSame(Matematica.getInstance(), Matematica.getInstance());
    }

}