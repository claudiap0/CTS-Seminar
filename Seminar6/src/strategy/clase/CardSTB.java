package strategy.clase;

public class CardSTB implements ModPlata{

    @Override
    public void platesteCalatorie(float pret) {
        System.out.println("S-a platit un bilet cu pretu de "+pret+" cu cardul STB");
    }
}