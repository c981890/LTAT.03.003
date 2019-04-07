package eu.trumm;

public class Lennuk {
    private String nimi;
    private double keskmineKiirus;
    private int maksimaalneReisijateArv;

    public Lennuk(String nimi, double keskmineKiirus, int maksimaalneReisijateArv) {
        this.nimi = nimi;
        this.keskmineKiirus = keskmineKiirus;
        this.maksimaalneReisijateArv = maksimaalneReisijateArv;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getKeskmineKiirus() {
        return keskmineKiirus;
    }

    public void setKeskmineKiirus(double keskmineKiirus) {
        this.keskmineKiirus = keskmineKiirus;
    }

    public int getMaksimaalneReisijateArv() {
        return maksimaalneReisijateArv;
    }

    public void setMaksimaalneReisijateArv(int maksimaalneReisijateArv) {
        this.maksimaalneReisijateArv = maksimaalneReisijateArv;
    }

    @Override
    public String toString() {
        return "Lennuk{" +
                "nimi='" + nimi + '\'' +
                ", keskmineKiirus=" + keskmineKiirus +
                ", maksimaalneReisijateArv=" + maksimaalneReisijateArv +
                '}';
    }
}
