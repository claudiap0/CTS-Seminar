package temple.clase;

public abstract class MijlocTransportPeSine {
    protected abstract void  opresteStatia1();
    protected abstract void opresteStatia2();
    protected abstract void opresteStatia3();
    public final void parcurgeTraseul(){
        opresteStatia1();
        opresteStatia2();
        opresteStatia3();
    }
    public final void parcurgeTraseuInvers(){
        opresteStatia3();
        opresteStatia2();
        opresteStatia1();
    }
}
