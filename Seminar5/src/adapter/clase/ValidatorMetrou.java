package adapter.clase;

public class ValidatorMetrou implements ValidatorulMeu {


    @Override
    public void validareCalatorie() {
        System.out.println("Calatoria de metrou a fost validata");
    }

    @Override
    public void validareAbonament() {
        System.out.println("Abonametnul de metrou a fost validat");
    }
}
