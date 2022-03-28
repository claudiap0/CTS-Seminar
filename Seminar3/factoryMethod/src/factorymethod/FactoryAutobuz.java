package factorymethod;

public class FactoryAutobuz implements FactoryMijlocTransport{
    @Override
    public MijlocTransport getMijlocTransport(int nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
