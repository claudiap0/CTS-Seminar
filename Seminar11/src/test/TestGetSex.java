package test;

import clase.Persoana;
import org.junit.Test;
import clase.CNPIncorect;

import static junit.framework.TestCase.assertEquals;

public class TestGetSex {

    //right BICEP

    @Test
    public void testCorectSexM() {
        Persoana persoana = new Persoana("Ion", "500123040");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testCorectSexF() {
        Persoana persoana = new Persoana("Ana", "600123040");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testBounderySexInferior() {
        Persoana persoana = new Persoana("Ion", "1000123040");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testBounderySexSuperior() {
        Persoana persoana = new Persoana("Ana", "6220123040");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testCrossCheckSex() {
        Persoana persoana = new Persoana("Ion", "50000000");
        assertEquals(persoana.CNP.charAt(0) % 2 == 0?"F":"M", persoana.getSex());
    }

    @Test(expected = CNPIncorect.class)
    public void testErrorSex() {
        Persoana persoana = new Persoana("Ion", "050000000");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void testPerformanceSex() {
        Persoana persoana = new Persoana("Ion", "50000000");
        persoana.getSex();
    }

    //CORRECT

    //format
    @Test
    public void testFormatSex() {
        Persoana persoana = new Persoana("Ana", "6010202010");
        assertEquals(1, persoana.getSex().length());
    }

    //order
    @Test
    public void testOrderSex() {

    }

    //referinta externa
    @Test
    public void testReferintaExternaSex() {

    }

    //existance
    @Test(expected = NullPointerException.class)
    public void testExistanceSex() {
        Persoana persoana = new Persoana("Ana", null);
        persoana.getSex();
    }

}
