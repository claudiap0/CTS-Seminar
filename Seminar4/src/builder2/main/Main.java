package builder2.main;

import builder2.clase.Autobuz;
import builder2.clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder builder= new AutobuzBuilder();

        builder.setOraIncepereProgram(5).setNumeSofer("Dorel").setLinie(10);
        Autobuz autobuz1= builder.build();
        System.out.println(autobuz1.toString());

        builder.setNumeSofer("Giani"). setTextDerulat("eu <3 bere"). setPauzaSofer(true);
        Autobuz autobuz2= builder.build();
        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
    }
}
