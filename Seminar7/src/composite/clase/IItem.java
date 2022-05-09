package composite.clase;

public interface IItem {
    void adaugaItem(IItem item) throws Exception;
    void stergeItem(IItem item) throws Exception;
    void descriereItem();
    IItem getItem(int pozitie) throws Exception;
    float calculeazaSumaGarantata(float pretPerLoc);


}
