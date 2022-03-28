package factorymethod.program;

import factorymethod.Autobuz;
import factorymethod.FactoryAutobuz;
import factorymethod.MijlocTransport;

public class Program {
    public static void main(String[] args) {
        MijlocTransport autobuz = new FactoryAutobuz().getMijlocTransport(111);
        MijlocTransport troleibuz = new FactoryAutobuz().getMijlocTransport(222);
        MijlocTransport tramvai = new FactoryAutobuz().getMijlocTransport(333);

        System.out.println(autobuz.toString());
        System.out.println(troleibuz.toString());
        System.out.println(tramvai.toString());
    }
}
