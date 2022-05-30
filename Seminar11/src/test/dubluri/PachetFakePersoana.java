package test.dubluri;

import clase.IPersoana;

public class PachetFakePersoana implements IPersoana {
    private int valoareGetVarsta;
    private String valoareGetSex;
    private boolean valoareCheckCNP;

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    public void setValoareCheckCNP(boolean valoareCheckCNP) {
        this.valoareCheckCNP = valoareCheckCNP;
    }

    @Override
    public String getSex() {
        return valoareGetSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoareCheckCNP;
    }
}
