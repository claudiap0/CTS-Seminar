package command.program;

import command.clase.Autobuz;
import command.clase.Comanda;
import command.clase.ManagerComenzi;
import command.clase.PleacaInCursa;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz();
        Autobuz autobuz2 = new Autobuz();
        Autobuz autobuz3 = new Autobuz();

        Comanda c1 = new PleacaInCursa(autobuz1, 331);
        ManagerComenzi mc = new ManagerComenzi();

        mc.invocaComenzi(new PleacaInCursa(autobuz1, 331));
        mc.invocaComenzi(new PleacaInCursa(autobuz1, 341));
        mc.invocaComenzi(new PleacaInCursa(autobuz1, 351));

        mc.executaComanda();
    }
}
