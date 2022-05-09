package state.program;

import state.clase.Autobuz;
import state.clase.InCursa;
import state.clase.LaCapatDeLinie;
import state.clase.State;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(99);
        autobuz.trimiteLaReparat();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.pleacaInCursa();
        autobuz.iesireDinService();
        autobuz.ajungeLaCapatDeLinie();
//        autobuz.setState(new LaCapatDeLinie());
        autobuz.ajungeLaCapatDeLinie();
    }
}
