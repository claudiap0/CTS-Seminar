package chainOfResponsability.clase;

public class TramvaiHandler extends Handler {

    public TramvaiHandler(Handler nextHandler, int pragSuperior) {
        super(nextHandler, pragSuperior);
    }

    public TramvaiHandler(int pragSuperior) {
        super(pragSuperior);
    }

    @Override
    public void afiseazaRecomandare(int distanta) {
        if(distanta<getPragSuperior()){
            System.out.println("este recomandat sa mergi cu tramvaiul pentru distanta de "+ distanta);

        }
        else
        {
            nextHandler.afiseazaRecomandare(distanta);
        }
    }
}