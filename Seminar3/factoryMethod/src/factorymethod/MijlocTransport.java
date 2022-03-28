package factorymethod;
//clasa abstracta(ne putem pune atribute, putem sa implemantam anumite metode) vs interfata
public abstract class MijlocTransport {

    private int nrInmatriculare;

    public MijlocTransport(int nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "nrInmatriculare=" + nrInmatriculare +
                '}';
    }
}
