package decorator.clase;

public abstract class DecoratorAbstract implements IImprimanta{
    IImprimanta iImprimanta;

    public DecoratorAbstract(IImprimanta iImprimanta) {
        this.iImprimanta = iImprimanta;
    }

    @Override
    public void printeaza() {
        iImprimanta.printeaza();
    }

    public abstract void printeazaVerso();
}