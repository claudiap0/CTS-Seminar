package factory;
//se odreste implementarea unui produs software pentru o companie de transport.

//familie de obiecte-Factory
//singur obiect-Singleton
//denumire mai buna: FabricaMijloaceDeTransport
public class Factory {
    public MijlocTransport getMijlocTransport(TipTransport tipTransport, int nrInmatriculare) {
        switch (tipTransport) {
            case AUTOBUZ:
                return new Autobuz(nrInmatriculare);
                //nu punem break ca avem return
            case TRAMVAI:
                return new Tramvai(nrInmatriculare);
            case TROLEIBUZ:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
