package strategy.clase;

public class Validator {
    private float pretCalatorie;
    ModPlata modPlata;

    public Validator(float pretCalatorie) {
        this.pretCalatorie = pretCalatorie;
        setModPlata(new CardSTB());
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void valideazaCalatorie(){
        modPlata.platesteCalatorie(this.pretCalatorie);
    }

}
