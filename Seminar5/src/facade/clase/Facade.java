package facade.clase;

public class Facade {
    static Autobuz autobuz= Autobuz.getInstance();

    public static void deschideUsile(){
        autobuz.deschideUsa1();
        autobuz.deschideUsa2();
        autobuz.deschideUsa3();
    }
    public static void punePeLiberUsile(){
        autobuz.punePeLiberUsa1();
        autobuz.punePeLiberUsa2();
        autobuz.punePeLiberUsa3();
    }
}
