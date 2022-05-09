package flyweight.clase;

public class Autobuz implements AutobuzLinie{

    private String model;
    private int an;
    private int nrLocuri;

    public Autobuz(String model, int an, int nrLocuri) {
        this.model = model;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descriereAutobuz(Linie linie) {
        System.out.println("Linie: "+linie.toString()+" Autobuz: " +toString());
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", an=" + an +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
