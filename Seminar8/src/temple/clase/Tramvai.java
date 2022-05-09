package temple.clase;

public class Tramvai extends MijlocTransportPeSine{
    private String nrTramvai;

    public Tramvai(String nrTramvai) {
        this.nrTramvai = nrTramvai;
    }

    @Override
    protected void opresteStatia1() {
        System.out.println("Tramvaiul "+nrTramvai+" a oprit in statia 1");
    }

    @Override
    protected void opresteStatia2() {
        System.out.println("Tramvaiul "+nrTramvai+" a oprit in statia 2");
    }

    @Override
    protected void opresteStatia3() {
        System.out.println("Tramvaiul "+nrTramvai+" a oprit in statia 3");
    }

}