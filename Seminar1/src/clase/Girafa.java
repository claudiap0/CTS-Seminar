package clase;

public class Girafa extends Animal{
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Girafa(String nume) {
        this.nume = nume;
    }

    @Override
    public void mananca(String mancare) {
        System.out.println("Girafa " +getNume() + " mananca " + mancare);
    }
}
