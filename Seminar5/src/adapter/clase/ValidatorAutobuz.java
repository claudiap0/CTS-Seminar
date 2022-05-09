package adapter.clase;

public class ValidatorAutobuz implements Validator {

    @Override
    public void validareAbonament() {
        System.out.println("abonament validat");
    }

    @Override
    public void v_bilet() {
        System.out.println("bilet validat");
    }
}
