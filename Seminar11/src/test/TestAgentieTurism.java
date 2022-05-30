package test;

import clase.AgentieTurism;
import clase.IPachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import test.categorii.ITesteAdaugaPachet;
import test.categorii.ITesteCalculareSuaTotalaPachete;
import test.categorii.ITesteCuFake;
import test.dubluri.PachetDummy;
import test.dubluri.PachetFake;
import test.dubluri.PachetStub;

import static junit.framework.TestCase.assertEquals;

public class TestAgentieTurism {
    @Test
    @Category(ITesteAdaugaPachet.class)
    public void testAdaugaPachet() {
        PachetDummy pachetDummy = new PachetDummy();
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(pachetDummy);
        assertEquals(1, agentieTurism.getNumarPachete());
    }

    @Test
    @Category(ITesteCalculareSuaTotalaPachete.class)
    public void testCalculareSumaTotalaPachete() {
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(new PachetStub());
        agentieTurism.adaugaPachet(new PachetStub());
        assertEquals(200.0, agentieTurism.calculareSumaTotalaPachete());
    }

    @Test
    @Category({ITesteCalculareSuaTotalaPachete.class, ITesteCuFake.class})
    public void testCalculeazaSumaTotalaPacheteFake() {
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake p1 = new PachetFake();
        p1.setValoareGetPret(100.0);
        PachetFake p2 = new PachetFake();
        p2.setValoareGetPret(200.0);
        agentieTurism.adaugaPachet(p1);
        agentieTurism.adaugaPachet(p2);

        assertEquals(300.0, agentieTurism.calculareSumaTotalaPachete());
    }
}
