package decorator.clase;

public class ImprimantaDeBilete implements IImprimanta{
    private int pretBilet;

    public ImprimantaDeBilete(int pretBilet) {
        this.pretBilet = pretBilet;
    }

    @Override
    public void printeaza() {
        System.out.println("Biletul cu pretul: "+pretBilet+" lei.");
    }

}
