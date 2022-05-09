package state.clase;

public class LaCapatDeLinie implements State{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(!(autobuz.getState() instanceof LaCapatDeLinie) ){
            System.out.println("Autobuzul cu nr "+autobuz.getNrAutobuz()+" este la capat de linie ");
            autobuz.setState(new LaCapatDeLinie());}
        else System.out.println("este deja la capat de linie");
    }
}
