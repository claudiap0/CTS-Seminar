package chainOfResponsability.clase;

public class MetrouHandler extends Handler{

    public MetrouHandler(Handler nextHandler, int pragSuperior) {
        super(nextHandler, pragSuperior);
    }

    public MetrouHandler(int pragSuperior) {
        super(pragSuperior);
    }

    @Override
    public void afiseazaRecomandare(int distanta) {
        if(distanta<getPragSuperior()){
            System.out.println("este recomandat sa mergi cu metroul pentru distanta de "+ distanta);
        }else {
            nextHandler.afiseazaRecomandare(distanta);
        }

    }
}