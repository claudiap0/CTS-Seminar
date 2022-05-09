package memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {
    private List<MementoAutobuz> listaMemento;

    public ManagerAutobuz() {
        this.listaMemento = new ArrayList<>();
    }

    public void adaugaMemento(MementoAutobuz mementoAutobuz) {
        listaMemento.add(mementoAutobuz);
    }

    public MementoAutobuz getAutobuz(int index) {
        return listaMemento.get(index);
    }
}
