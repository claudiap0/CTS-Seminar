package factorymethod;

public class FactoryTramvai implements FactoryMijlocTransport{
    @Override
    public MijlocTransport getMijlocTransport(int nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
