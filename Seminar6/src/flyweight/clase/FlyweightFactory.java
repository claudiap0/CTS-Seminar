package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<Integer, Linie> linieMap;

    public FlyweightFactory() {
        this.linieMap = new HashMap<>();
    }

    public Linie getLinie(Integer nrLinie){
        Linie linieReturnat= linieMap.get(nrLinie);
        if(linieReturnat!= null){
            return linieReturnat;
        }else {
            //statiile pot fi preluate din fisier sau baze de date
            linieReturnat = new Linie(nrLinie, "Prima Statie", "Ultima statie");
            linieMap.put(nrLinie, linieReturnat);
            return linieReturnat;
        }
    }
}
