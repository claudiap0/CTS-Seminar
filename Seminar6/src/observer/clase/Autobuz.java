package observer.clase;

public class Autobuz extends MijlocTransport{

    private int nrLinie;

    public Autobuz(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public Autobuz() {
        super();
    }

    @Override
    public void anuntaCalatori() {
        for(ICalator c: calatori)
        {
            c.primesteNotificare(" Autobuzul "+nrLinie+" a plecat de la capat");
        }
    }
}