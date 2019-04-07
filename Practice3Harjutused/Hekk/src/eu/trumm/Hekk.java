package eu.trumm;

import java.util.Arrays;

public class Hekk {

    private String nimi;
    private Põõsas[] põõsad;

    public Hekk(String nimi, Põõsas[] põõsad) {
        this.nimi = nimi;
        this.põõsad = põõsad;
    }

    public double maksKorgus() {
        double maksPoosaKorgus = this.põõsad[0].getKorgus();
        for (Põõsas liige : this.põõsad) {
            if (maksPoosaKorgus < liige.getKorgus()) {
                maksPoosaKorgus = liige.getKorgus();
            }
        }
        return maksPoosaKorgus;
    }

    public double hekiPikkus() {
        double hekiPikkus = 0.0;
        for (Põõsas liige : this.põõsad) {
            hekiPikkus += liige.getLaius();
        }

        return hekiPikkus;
    }

    @Override
    public String toString() {
        return "Hekk{" +
                "nimi='" + nimi + '\'' +
                ", kõige kõrgema põõsa kõrgus=" + maksKorgus() +
                ", heki pikkus=" + hekiPikkus() +
                '}';
    }
}
