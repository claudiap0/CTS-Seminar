package proxy.clase;

public class Autobuz implements MijlocTransport{
    private String nrAutobuz;
    private int nrCalatori;

    public Autobuz(String nrAutobuz, int nrCalatori) {
        this.nrAutobuz = nrAutobuz;
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatii() {
        System.out.println("Autobuzul cu nr "+ nrAutobuz+ " a oprit in statie cu "+nrCalatori+"calatori");
    }

    @Override
    public int getNrCalatori() {
        return nrCalatori;
    }
}
