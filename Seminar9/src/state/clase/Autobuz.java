package state.clase;

public class Autobuz {
    private int nrAutobuz;
    private State state;

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public State getState() {
        return state;
    }

    protected void setState(State state) {
        this.state = state;
    }

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa() {
        new InCursa().modificaStare(this);
    }

    public void ajungeLaCapatDeLinie() {
        new LaCapatDeLinie().modificaStare(this);
    }

    public void trimiteLaReparat() {
        new LaReparat().modificaStare(this);
    }

    public void iesireDinService() {
        new LaCapatDeLinie().modificaStare(this);
    }
}
