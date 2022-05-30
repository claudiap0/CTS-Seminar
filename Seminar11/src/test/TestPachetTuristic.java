package test;

import clase.PachetTuristic;
import clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import test.categorii.ITesteAplicaDiscount;
import test.categorii.ITesteBoundary;
import test.categorii.ITesteCuFake;
import test.categorii.ITestePoateRezerva;
import test.dubluri.PachetFakePersoana;

import static junit.framework.TestCase.*;

public class TestPachetTuristic {
    @Test
    @Category({ITestePoateRezerva.class, ITesteCuFake.class})
    public void testPoateRezerva() {
        PachetFakePersoana persoana = new PachetFakePersoana();
        persoana.setValoareGetVarsta(21);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bucuresti", 100.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({ITestePoateRezerva.class, ITesteCuFake.class})
    public void testNuPoateRezerva() {
        PachetFakePersoana persoana = new PachetFakePersoana();
        persoana.setValoareGetVarsta(15);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bucuresti", 100.0);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({ITestePoateRezerva.class, ITesteCuFake.class, ITesteBoundary.class})
    public void testPoateRezervaBoundary() {
        PachetFakePersoana persoana = new PachetFakePersoana();
        persoana.setValoareGetVarsta(18);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bucuresti", 200.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({ITesteAplicaDiscount.class, ITesteCuFake.class})
    public void testRightAplicaDiscountVarstnici() {
        PachetFakePersoana persoana = new PachetFakePersoana();
        persoana.setValoareGetVarsta(70);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Timisoara", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(250.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category({ITesteAplicaDiscount.class, ITesteCuFake.class})
    public void testRightNuAplicaDiscountVarstnici() {
        PachetFakePersoana persoana = new PachetFakePersoana();
        persoana.setValoareGetVarsta(18);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Timisoara", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(500, pachetTuristic.getPret(), 0.01);
    }
}
