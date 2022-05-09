package chainOfResponsability.clase;

public abstract class Handler {
    protected Handler nextHandler;
    private int pragSuperior;

    public Handler(Handler nextHandler, int pragSuperior) {
        this.nextHandler = nextHandler;
        this.pragSuperior = pragSuperior;
    }

    public Handler(int pragSuperior) {
        nextHandler=null;
        this.pragSuperior = pragSuperior;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void setPragSuperior(int pragSuperior) {
        this.pragSuperior = pragSuperior;
    }

    public int getPragSuperior() {
        return pragSuperior;
    }

    public abstract void afiseazaRecomandare(int distanta);
}