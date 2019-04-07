package eu.trumm;

public class Isik {
    private String nimi;
    private double pikkus;

    public Isik(String isikuNimi, double isikuPikkus) {
        nimi = isikuNimi;
        pikkus = isikuPikkus;
    }

    public int suusakepiPikkus() {
        return (int) Math.round(0.85 * pikkus * 100);
    }
}