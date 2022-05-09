package memento.program;

import memento.clase.Autobuz;
import memento.clase.ManagerAutobuz;

public class Main {

    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Ion", 7.3, "Mercedes", 2018);
        System.out.println(autobuz.toString());

        ManagerAutobuz managerAutobuz = new ManagerAutobuz();
        managerAutobuz.adaugaMemento(autobuz.creareMemento());

        autobuz.setNumeSofer("Mircea");
        managerAutobuz.adaugaMemento(autobuz.creareMemento());
        autobuz.setConsumMediu(10);
        managerAutobuz.adaugaMemento(autobuz.creareMemento());

        System.out.println(autobuz.toString());

        autobuz.revenireStareAnterioare(managerAutobuz.getAutobuz(0));
        System.out.println(autobuz.toString());
    }

}
