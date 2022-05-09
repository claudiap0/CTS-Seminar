package prototype.main;

import prototype.clase.Autobuz;
import prototype.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz autobuz= new Autobuz("Marcel");
        MijlocTransport autobuz2= (Autobuz) autobuz.copiaza();

        System.out.println(autobuz.toString());
        System.out.println(autobuz2.toString());
    }
}
