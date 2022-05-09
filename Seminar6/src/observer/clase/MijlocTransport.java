package observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport {

    protected List<ICalator> calatori;

    public MijlocTransport() {
        this.calatori = new ArrayList<>();
    }

    public void adaugaCalator(ICalator calator){
        calatori.add(calator);
    }

    public void stergeCalator(ICalator calator){
        calatori.remove(calator);
    }

    public abstract void anuntaCalatori();
}