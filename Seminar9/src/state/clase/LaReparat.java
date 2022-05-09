package state.clase;

public class LaReparat implements State{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getState() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul cu nr "+autobuz.getNrAutobuz()+" intra in service pentru ca este la capat de linie");
            autobuz.setState(new LaReparat());
        }
        else System.out.println("nu poate fi trimis la reparat pentru ca nu este la capat de linie");
    }
}
