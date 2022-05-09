package memento.clase;

public class MementoAutobuz {
    private String numeSofer;
    private double consumMediu;

    public String getNumeSofer() {
        return numeSofer;
    }

    public double getConsumMediu() {
        return consumMediu;
    }

    public MementoAutobuz(String numeSofer, double consumMediu) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }
}
