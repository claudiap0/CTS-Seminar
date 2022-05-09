package composite.clase;

public class Flota implements IItem{
    private String nume;
    private List<IItem> items;

    public Flota(String nume) {
        this.nume = nume;
        this.items = new ArrayList<>();
    }

    @Override
    public void adaugaItem(IItem item) throws Exception {
        items.add(item);
    }

    @Override
    public void stergeItem(IItem item) throws Exception {
        items.remove(item);
    }

    @Override
    public void descriereItem() {
        System.out.println(nume);
        for(IItem item :items)
        {
            item.descriereItem();
        }
    }

    @Override
    public IItem getItem(int pozitie) throws Exception {
        return items.get(pozitie);
    }

    @Override
    public float calculeazaSumaGarantata(float pretPerLoc) {
        int suma=0;
        for(IItem item: items)
        {
            suma+=item.calculeazaSumaGarantata(pretPerLoc);
        }
        return suma;
    }

    @Override
    public String toString() {
        return "Flota{" +
                "nume='" + nume + '\'' +
                ", items=" + items +
                '}';
    }
}
