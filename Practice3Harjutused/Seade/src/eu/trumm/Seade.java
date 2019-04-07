package eu.trumm;

public class Seade {
    private int kood;
    private String nimetus;
    private double hindKMta;
    private static double km = 1.2;

    public Seade(int kood, String nimetus, double hindKMta) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.hindKMta = hindKMta;
    }

    public double kmhind(double hindKMta) {
        return hindKMta*km;
    }

    public int getKood() {
        return kood;
    }

    public void setKood(int kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getHindKMta() {
        return hindKMta;
    }

    public void setHindKMta(double hindKMta) {
        this.hindKMta = hindKMta;
    }

    @Override
    public String toString() {
        return "Seade{" +
                "kood=" + kood +
                ", nimetus='" + nimetus + '\'' +
                ", hindKMta=" + hindKMta + '\'' +
                ", hindKMga=" + kmhind(hindKMta) +
                '}';
    }
}
