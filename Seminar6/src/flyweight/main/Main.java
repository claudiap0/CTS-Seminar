package flyweight.main;

import flyweight.clase.Autobuz;
import flyweight.clase.FlyweightFactory;
import flyweight.clase.Linie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("a1", 2019, 45);
        Autobuz autobuz2 = new Autobuz("a2", 2017, 40);
        Autobuz autobuz3 = new Autobuz("a3", 2019, 40);
        Autobuz autobuz4 = new Autobuz("a4", 2018, 35);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Linie linie1 = flyweightFactory.getLinie(133);
        Linie linie2 = flyweightFactory.getLinie(165);

        autobuz1.descriereAutobuz(linie1);
        autobuz2.descriereAutobuz(linie2);
        autobuz3.descriereAutobuz(linie2);
        autobuz4.descriereAutobuz(linie1);

    }
}
