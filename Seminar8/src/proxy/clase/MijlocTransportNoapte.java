package proxy.clase;

public class MijlocTransportNoapte implements MijlocTransport{
    private MijlocTransport mijlocTransport;

    public MijlocTransportNoapte(MijlocTransport autobuz) {
        this.mijlocTransport = autobuz;
    }

    @Override
    public void opresteInStatii() {
        if(mijlocTransport.getNrCalatori()>0)
        {
            System.out.println("Autobuzul a oprit in statie noaptea cu " +getNrCalatori()+" calatori");
        }
        else{
            System.out.println("Autobuzul de noapte nu a mai oprit in statie");
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocTransport.getNrCalatori();
    }
}
