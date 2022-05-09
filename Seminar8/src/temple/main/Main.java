package temple.main;

import temple.clase.MijlocTransportPeSine;
import temple.clase.Tramvai;

public class Main {
    public static void main(String[] args) {
        MijlocTransportPeSine tramvai1 = new Tramvai("B1");
        MijlocTransportPeSine tramvai2 = new Tramvai("B2");

        tramvai1.parcurgeTraseul();
        System.out.println("******************");
        tramvai1.parcurgeTraseuInvers();
    }
}
