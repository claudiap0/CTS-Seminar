package composite.main;

import composite.clase.Autobuz;
import composite.clase.Flota;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1= new Autobuz("mercedes","m1", 10);
        Autobuz autobuz2= new Autobuz("mercedes","m2", 8);
        Autobuz autobuz3= new Autobuz("mercedes","m3", 20);
        Autobuz autobuz4= new Autobuz("mercedes","m4", 15);
        Autobuz autobuz5= new Autobuz("mercedes","m5", 8);
        Autobuz autobuz6= new Autobuz("mercedes","m6", 25);

        Flota flota1= new Flota("flotaMica");
        Flota flota2= new Flota("flotaMedie");
        Flota flota3= new Flota("flotaMare");
        Flota flotaGenereala = new Flota("flotaGenerala");
        try {
            flota1.adaugaItem(autobuz2);
            flota1.adaugaItem(autobuz5);

            flota2.adaugaItem(autobuz1);
            flota2.adaugaItem(autobuz4);

            flota3.adaugaItem(autobuz6);
            flota3.adaugaItem(autobuz3);

            flotaGenereala.adaugaItem(flota1);
            flotaGenereala.adaugaItem(flota3);
            flotaGenereala.adaugaItem(flota2);

            flotaGenereala.descriereItem();
            flotaGenereala.stergeItem(flota2);

            flotaGenereala.getItem(1);
            flota2.stergeItem(autobuz4);
            flota2.descriereItem();

            System.out.println(flotaGenereala.calculeazaSumaGarantata(10));
            System.out.println(flota3.calculeazaSumaGarantata(10));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
