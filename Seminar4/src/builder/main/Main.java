package builder.main;

import builder.clase.Autobuz;
import builder.clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("dorel").setDeschideUsile(false);
        Autobuz autobuz= autobuzBuilder.build();

        Autobuz autobuz2= new AutobuzBuilder().setLinie(10).setOraIncepereProgram(6).setNumeSofer("Bobita").build();
        System.out.println(autobuz.toString());
        System.out.println(autobuz2.toString());

        AutobuzBuilder builder= new AutobuzBuilder();
        builder.setTextDerulat("la multi ani").setOraIncepereProgram(12);
        Autobuz autobuz3= builder.build();
        System.out.println(autobuz3.toString());
    }
}
