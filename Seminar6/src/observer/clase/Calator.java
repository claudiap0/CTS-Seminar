package observer.clase;

public class Calator implements ICalator{
    String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String notificare) {
        System.out.println("Clientul "+nume+" a fost notificat: "+notificare);
    }
}