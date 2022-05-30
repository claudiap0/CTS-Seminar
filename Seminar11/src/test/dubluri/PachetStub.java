package test.dubluri;

import clase.IPachetTuristic;

public class PachetStub implements IPachetTuristic {


    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return 100.0;
    }
}
