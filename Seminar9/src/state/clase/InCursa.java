package state.clase;

public class InCursa implements State{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if (autobuz.getState() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul cu nr "+autobuz.getNrAutobuz()+" poate pleca in cursa fiind la capat de linie");
            autobuz.setState(new InCursa());
        }
        else System.out.println("nu poate pleca in cursa deoarece nu este la capat de cursa");
    }
}
