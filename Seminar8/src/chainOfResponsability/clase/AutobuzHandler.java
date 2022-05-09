package chainOfResponsability.clase;

public class AutobuzHandler extends Handler{

    public AutobuzHandler(Handler nextHandler, int pragSuperior) {
        super(nextHandler, pragSuperior);
    }

    public AutobuzHandler(int pragSuperior) {
        super(pragSuperior);
    }

    @Override
    public void afiseazaRecomandare(int distanta) {
        if(distanta<getPragSuperior()){
            System.out.println("Este recomandat sa mergeti cu autobuzul pentru distanta de "+ distanta);
        }else
        {
            nextHandler.afiseazaRecomandare(distanta);
        }

    }
}