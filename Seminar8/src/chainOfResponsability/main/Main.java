package chainOfResponsability.main;

import chainOfResponsability.clase.AutobuzHandler;
import chainOfResponsability.clase.MetrouHandler;
import chainOfResponsability.clase.TramvaiHandler;

public class Main {
    public static void main(String[] args) {
        AutobuzHandler autobuzHandler= new AutobuzHandler(3);
        TramvaiHandler tramvaiHandler= new TramvaiHandler(5);
        MetrouHandler metrouHandler= new MetrouHandler(150);
        autobuzHandler.setNextHandler(tramvaiHandler);
        tramvaiHandler.setNextHandler(metrouHandler);

        autobuzHandler.afiseazaRecomandare(2);
        autobuzHandler.afiseazaRecomandare(4);
        autobuzHandler.afiseazaRecomandare(8);
    }
}
