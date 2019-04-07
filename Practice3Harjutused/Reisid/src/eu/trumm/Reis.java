package eu.trumm;

public class Reis {

    private String reisiSihtpunkt;
    private int sihtpunktiKaugus;
    private Lennuk lennuk;
    private int myydudPiletid;

    public Reis(String reisiSihtpunkt, int sihtpunktiKaugus, Lennuk lennuk, int myydudPiletid) {
        this.reisiSihtpunkt = reisiSihtpunkt;
        this.sihtpunktiKaugus = sihtpunktiKaugus;
        this.lennuk = lennuk;
        this.myydudPiletid = myydudPiletid;
    }

    public int reisiKestvus() {
        return (int) (this.sihtpunktiKaugus / this.lennuk.getKeskmineKiirus() * 60);
    }

    public int vabadKohad() {
        return this.lennuk.getMaksimaalneReisijateArv() - this.myydudPiletid;
    }

    public String getReisiSihtpunkt() {
        return reisiSihtpunkt;
    }

    public void setReisiSihtpunkt(String reisiSihtpunkt) {
        this.reisiSihtpunkt = reisiSihtpunkt;
    }

    public int getSihtpunktiKaugus() {
        return sihtpunktiKaugus;
    }

    public void setSihtpunktiKaugus(int sihtpunktiKaugus) {
        this.sihtpunktiKaugus = sihtpunktiKaugus;
    }

    public Lennuk getLennuk() {
        return lennuk;
    }

    public void setLennuk(Lennuk lennuk) {
        this.lennuk = lennuk;
    }

    public int getMyydudPiletid() {
        return myydudPiletid;
    }

    public void setMyydudPiletid(int myydudPiletid) {
        this.myydudPiletid = myydudPiletid;
    }

    @Override
    public String toString() {
        return "Reis{" +
                "reisiSihtpunkt='" + reisiSihtpunkt + '\'' +
                ", sihtpunktiKaugus=" + sihtpunktiKaugus +
                ", lennuk=" + lennuk +
                ", myydudPiletid=" + myydudPiletid +
                '}';
    }
}
