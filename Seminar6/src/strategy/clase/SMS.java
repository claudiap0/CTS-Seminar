package strategy.clase;

public class SMS implements ModPlata{
    @Override
    public void platesteCalatorie(float pret) {
        System.out.println("S-a platit un bilet cu pretu de "+pret+" prin SMS");

    }
}
