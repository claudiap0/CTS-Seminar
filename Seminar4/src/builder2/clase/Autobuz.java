package builder2.clase;

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