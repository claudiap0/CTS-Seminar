package adapter.main;

import adapter.clase.*;

public class Main {
    public static void valideazaBilet(Validator validator){
        validator.v_bilet();
    }
    public static void valideazaAbonament(Validator validator){
        validator.validareAbonament();
    }

    public static void main(String[] args) {

        ValidatorAutobuz validatorAutobuz = new ValidatorAutobuz();
        valideazaBilet(validatorAutobuz);

        ValidatorMetrou validatorMetrou= new ValidatorMetrou();
        ValidatorSubteranAdapter validatorSubteranAdapter= new ValidatorSubteranAdapter(validatorMetrou);
        valideazaAbonament(validatorSubteranAdapter);
        AdapterMetrouClasa adapterMetrouClasa =  new AdapterMetrouClasa();
        valideazaAbonament(adapterMetrouClasa);
    }
}
