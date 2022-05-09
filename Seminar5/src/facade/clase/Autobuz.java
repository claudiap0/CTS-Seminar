package facade.clase;

public class Autobuz {

    private static Autobuz autobuz= null;
    private void Autobuz(){}

    public void deschideUsa1(){
        System.out.println("deschide usa 1");
    }
    public void deschideUsa2(){
        System.out.println("deschide usa 2");
    }
    public void deschideUsa3(){
        System.out.println("deschide usa 3");
    }

    public void punePeLiberUsa1(){
        System.out.println("pune pe liber usa 1");
    }
    public void punePeLiberUsa2(){
        System.out.println("pune pe liber usa 2");
    }
    public void punePeLiberUsa3(){
        System.out.println("pune pe liber usa 3");
    }

    public static Autobuz getInstance() {
        if(autobuz==null) {
            autobuz = new Autobuz();
        }
        return autobuz;
    }
}
