package test.dubluri;

import clase.IPachetTuristic;

public class PachetFake implements IPachetTuristic {
    private boolean valoarePoateRezerva;
    private double valoareGetPret;

    public void setValoarePoateRezerva(boolean valoarePoateRezerva) {
        this.valoarePoateRezerva = valoarePoateRezerva;
    }

    public void setValoareGetPret(double valoareGetPret) {
        this.valoareGetPret = valoareGetPret;
    }

    @Override
    public boolean poateRezerva() {
        return valoarePoateRezerva;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return valoareGetPret;
    }
}
