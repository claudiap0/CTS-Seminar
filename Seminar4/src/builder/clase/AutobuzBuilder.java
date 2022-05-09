package builder.clase;

import builder.clase.Autobuz;

public class AutobuzBuilder implements Builder {
    private Autobuz autobuz;

    public AutobuzBuilder(){
        this.autobuz= new Autobuz("sofer", 0,true,false,8,"STB");

    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setLinie(int linie) {
        this.autobuz.setLinie(linie);
        return this;
    }

    public AutobuzBuilder setPauzaSofer(boolean pauzaSofer) {
        this.autobuz.setPauzaSofer(pauzaSofer);
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.autobuz.setDeschideUsile(deschideUsile);
        return this;
    }

    public AutobuzBuilder setOraIncepereProgram(int oraIncepereProgram) {
        this.autobuz.setOraIncepereProgram(oraIncepereProgram);
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        this.autobuz.setTextDerulat(textDerulat);
        return this;
    }


    @Override
    public Autobuz build() {
        return autobuz;
    }
}