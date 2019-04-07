package eu.trumm;

public class Põõsas {

    private double korgus;
    private double laius;

    public Põõsas(double korgus, double laius) {
        this.korgus = korgus;
        this.laius = laius;
    }

    public double prognoositavaAastajuurdekasv() {
        return (Math.random()*0.1) * this.korgus;
    }

    public double getKorgus() {
        return korgus;
    }

    public void setKorgus(double korgus) {
        this.korgus = korgus;
    }

    public double getLaius() {
        return laius;
    }

    public void setLaius(double laius) {
        this.laius = laius;
    }

    @Override
    public String toString() {
        return "Põõsas{" +
                "korgus=" + korgus +
                ", laius=" + laius +
                ", prognoositav juurdekasv=" + prognoositavaAastajuurdekasv() +
                '}';
    }
}
