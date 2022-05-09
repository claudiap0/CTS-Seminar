package proxy.main;

import proxy.clase.Autobuz;
import proxy.clase.MijlocTransport;
import proxy.clase.MijlocTransportNoapte;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz1= new Autobuz("B123ABC", 20);
        MijlocTransport autobuz2= new Autobuz("B12XYZ", 0);
        MijlocTransportNoapte mijlocTransportNoapte1= new MijlocTransportNoapte(autobuz1);
        MijlocTransportNoapte mijlocTransportNoapte2= new MijlocTransportNoapte(autobuz2);

        autobuz1.opresteInStatii();
        autobuz2.opresteInStatii();
        mijlocTransportNoapte1.opresteInStatii();
        mijlocTransportNoapte2.opresteInStatii();
    }
}
