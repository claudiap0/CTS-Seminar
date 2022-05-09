package memento.clase;

public class Autobuz {
    private String numeSofer;
    private double consumMediu;
    private String model;
    private int anFabricatie;

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }

    public Autobuz(String numeSofer, double consumMediu, String model, int anFabricatie) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(double consumMediu) {
        this.consumMediu = consumMediu;
    }

    public MementoAutobuz creareMemento() {
        return new MementoAutobuz(this.numeSofer, this.consumMediu);
    }

    public void revenireStareAnterioare(MementoAutobuz mementoAutobuz) {
        this.numeSofer = mementoAutobuz.getNumeSofer();
        this.consumMediu = mementoAutobuz.getConsumMediu();
    }
}
