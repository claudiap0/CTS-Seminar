package test.dubluri;

import clase.IPachetTuristic;

public class PachetDummy implements IPachetTuristic {

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return null;
    }
}
