package eu.trumm;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] testMassiiv = new int[5];
        testMassiiv[0] = 5;




        Põõsas kuuskpohi = new Põõsas(1.1, 0.75);
        Põõsas kuuskida = new Põõsas(1.2, 0.75);
        Põõsas kuusklõuna = new Põõsas(1.3, 0.75);
        Põõsas kuusklaas = new Põõsas(1.4, 0.75);
        Põõsas kuuskterrass = new Põõsas(1.1, 0.75);

        Põõsas[] kuusk = new Põõsas[] {kuuskpohi, kuuskida, kuusklõuna, kuusklaas, kuuskterrass};

        Hekk kuusehekk = new Hekk("kuusehekk", kuusk);

        System.out.println(kuusehekk);
        for (Põõsas liige : kuusk) {
            System.out.println(liige);
        }
    }
}
