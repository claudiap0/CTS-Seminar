package builder2.clase;

public class AutobuzBuilder implements Builder {
    private String numeSofer;
    private int linie;
    private boolean pauzaSofer;
    private boolean deschideUsile;
    private int oraIncepereProgram;
    private String textDerulat;

    public AutobuzBuilder(){
        this.numeSofer = "sofer";
        this.linie = 0;
        this.pauzaSofer = true;
        this.deschideUsile = true;
        this.oraIncepereProgram = 6;
        this.textDerulat = "STB";
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer=numeSofer;
        return this;
    }

    public AutobuzBuilder setLinie(int linie) {
        this.linie=linie;
        return this;
    }

    public AutobuzBuilder setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer=pauzaSofer;
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile=deschideUsile;
        return this;
    }

    public AutobuzBuilder setOraIncepereProgram(int oraIncepereProgram) {
        this.oraIncepereProgram=oraIncepereProgram;
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        this.textDerulat=textDerulat;
        return this;
    }


    @Override
    public Autobuz build() {
        return new Autobuz(this.numeSofer, this.linie, this.pauzaSofer, this.deschideUsile, this.oraIncepereProgram, this.textDerulat) ;
    }
}