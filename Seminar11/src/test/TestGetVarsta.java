package test;

import clase.CNPIncorect;
import clase.Persoana;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestGetVarsta {

    @Test
    public void testCorrectVarsta(){
        Persoana persoana = new Persoana("Ion", "500123123");
        assertEquals(21, persoana.getVarsta());
    }

    @Test
    public void testBoundaryVarstaInferior(){
        Persoana persoana = new Persoana("Ion", "3000123123");
        assertEquals(222, persoana.getVarsta());
    }

    @Test
    public void testBoundaryVarstaSuperior(){
        Persoana persoana = new Persoana("Ion", "5220123123");
        assertEquals(0, persoana.getVarsta());
    }

    @Test(expected = CNPIncorect.class)
    public void testErrorVarsta() {
        Persoana persoana = new Persoana("Ion", "5230123123");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void testPerformanceVarsta() {
        Persoana persoana = new Persoana("Ion", "5200123123");
        persoana.getVarsta();
    }

    @Test
    public void testOrderVarsta() {
        Persoana persoana1 = new Persoana("Ion", "1990123123");
        Persoana persoana2 = new Persoana("Ana", "6000123123");

        assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void testExistanceVarsta() {
        Persoana persoana = new Persoana("Ana", null);
        persoana.getVarsta();
    }
}
