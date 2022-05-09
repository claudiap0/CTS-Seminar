package decorator.clase;

public class Decorator extends DecoratorAbstract{
    private String mesaj;

    public Decorator(String mesaj, IImprimanta imprimanta) {
        super(imprimanta);
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaVerso() {
        System.out.println("verso "+mesaj);
    }
}
