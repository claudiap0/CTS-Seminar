package builder.clase;

public class Autobuz {
    private String numeSofer;
    private int linie;
    private boolean pauzaSofer;
    private boolean deschideUsile;
    private int oraIncepereProgram;
    private String textDerulat;

    public Autobuz(String numeSofer, int linie, boolean pauzaSofer, boolean deschideUsile, int oraIncepereProgram, String textDerulat) {
        this.numeSofer = numeSofer;
        this.linie = linie;
        this.pauzaSofer = pauzaSofer;
        this.deschideUsile = deschideUsile;
        this.oraIncepereProgram = oraIncepereProgram;
        this.textDerulat = textDerulat;
    }

    void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setLinie(int linie) {
        this.linie = linie;
    }

    void setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer = pauzaSofer;
    }

    void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    void setOraIncepereProgram(int oraIncepereProgram) {
        this.oraIncepereProgram = oraIncepereProgram;
    }

    void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", linie=" + linie +
                ", pauzaSofer=" + pauzaSofer +
                ", deschideUsile=" + deschideUsile +
                ", oraIncepereProgram=" + oraIncepereProgram +
                ", textDerulat='" + textDerulat + '\'' +
                '}';
    }
}