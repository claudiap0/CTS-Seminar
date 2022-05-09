package command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    List<ComandaPlecareInCursa> comenzi = new ArrayList<>();

    public void invocaComenzi(ComandaPlecareInCursa comandaPlecareInCursa) {
        comenzi.add(comandaPlecareInCursa);
    }

    public void executaComanda() {

    }
}
