package eu.trumm;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Lennuk fokker = new Lennuk("Fokker F50", 530, 46);
        Lennuk bh = new Lennuk("BN-2", 170, 9);

        Reis tlnTartu = new Reis("Tartu", 180, bh, 8);
        Reis tlnHelsingi = new Reis ("Helsingi", 90, fokker, 39);
        Reis amariAmari = new Reis ("Ämari", 8, bh, 9);

        System.out.println(tlnHelsingi.reisiKestvus());
        System.out.println(amariAmari.vabadKohad());
        System.out.println(tlnTartu.reisiKestvus());
    }
}
