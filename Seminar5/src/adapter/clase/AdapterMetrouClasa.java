package adapter.clase;

public class AdapterMetrouClasa extends ValidatorMetrou implements Validator {
    @Override
    public void v_bilet() {
        super.validareCalatorie();
    }
}