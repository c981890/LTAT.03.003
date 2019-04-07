import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("1. Massiivide ühildamine ja massiivi ümberpööramine\n");
        int[] massiiv1 = new int[] {-10, 17, 21};
        System.out.println("Massiiv I: " + Arrays.toString(massiiv1));
        int[] massiiv2 = new int[] {-2, 5, 17, 28};
        System.out.println("Massiiv II: " + Arrays.toString(massiiv2));
        int massiividePikkusKokku = massiiv1.length + massiiv2.length;
        System.out.println("Massiivide pikkus kokku: " + massiividePikkusKokku);

        int[] massiivUus = new int[massiividePikkusKokku];

        System.arraycopy(massiiv1, 0, massiivUus, 0, massiiv1.length);
        System.arraycopy(massiiv2, 0, massiivUus, massiiv1.length, massiiv2.length);
        Arrays.sort(massiivUus);
        System.out.println("a) Massiivide ühildamine");
        System.out.println(Arrays.toString(massiivUus));

        System.out.println("b) Massiivi „ümberpööramine“");

        int[] pooratudMassiiv = new int[massiividePikkusKokku];
        int m = 6;
        for (int element : massiivUus) {
            element *= -1;
            pooratudMassiiv[m] = element;
            m--;
        }
        System.out.println(Arrays.toString(pooratudMassiiv));
        System.out.println("\n__________________________________\n");

        System.out.println("\n2. Tantsupaarid\n");
        int[] poistePikkused = new int[] {180, 175, 200, 172, 169, 183, 188};
        System.out.println("Poiste pikkused: " + Arrays.toString(poistePikkused));
        int[] tydrukutePikkused = new int[] {165, 167, 172, 169, 162};
        System.out.println("Tüdrukute pikkused: " + Arrays.toString(tydrukutePikkused));

        Arrays.sort(poistePikkused);
        Arrays.sort(tydrukutePikkused);

        int lyhimaMassiiviPikkus;
        String paarilisetaJaid = null;
        if (poistePikkused.length < tydrukutePikkused.length) {
            lyhimaMassiiviPikkus = poistePikkused.length;
            paarilisetaJaid = "tüdrukud";
        } else if (poistePikkused.length > tydrukutePikkused.length) {
            lyhimaMassiiviPikkus = tydrukutePikkused.length;
            paarilisetaJaid = "poisid";
        } else {
            lyhimaMassiiviPikkus = poistePikkused.length;
        }
        System.out.println("Tantsupaarid on:");
        for (int i = 0; i < lyhimaMassiiviPikkus; i++) {
            System.out.print("(" + poistePikkused[i] + ", " + tydrukutePikkused[i] + ") ");
        }
        System.out.println("\nPaariliseta jäid " + paarilisetaJaid + " pikkustega");

        if (paarilisetaJaid.equals("tüdrukud")) {
            for (int i = poistePikkused.length; i < tydrukutePikkused.length; i++) {
                System.out.print(tydrukutePikkused[i]);
                if (i < tydrukutePikkused.length-1) {
                    System.out.print(", ");
                }
            }
        } else {
            for (int i = tydrukutePikkused.length; i < poistePikkused.length; i++) {
                System.out.print(poistePikkused[i]);
                if (i < poistePikkused.length-1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("\n__________________________________\n");

        System.out.println("3. Suusasprint\n");
        int[] stardinumbrid = new int[] {2, 1, 4, 5, 8, 7, 3, 6};
        double[] stoppernaidud = new double[] {148.2, 150.4, 165.7, 181.2, 226.0, 231.9, 0.0, 0.0};
        int[] stardiaeg = new int[stardinumbrid.length];
        stardiaeg = stardiaeg(stardinumbrid);
        // System.out.println(Arrays.toString(stardiaeg));
        double[] distantsiLabimisajad = new double[stardinumbrid.length];
        distantsiLabimisajad = distantsiLabimisajad(distantsiLabimisajad, stardiaeg, stoppernaidud);
        // System.out.println("Distantsi läbimise ajad: " + Arrays.toString(distantsiLabimisajad));

        int voitjaTulemuseIndeks = voitjaTulemuseIndeks(distantsiLabimisajad);
        // System.out.println("Võitja indeks: " + voitjaTulemuseIndeks);
        int katkestajad = katkestajad(stoppernaidud);
        // System.out.println(katkestajad);
        // System.out.println("Stardinumbrid: " + Arrays.toString(stardinumbrid));
        // System.out.println("Võitja stardinumber: " + stardinumbrid[voitjaTulemuseIndeks]);

        System.out.printf("Võitja stardinumber oli %s ja tema aeg oli %.1f. %n", stardinumbrid[voitjaTulemuseIndeks], distantsiLabimisajad[voitjaTulemuseIndeks]);
        System.out.println("Katkestajaid oli " + katkestajad + ".");

    }

    private static int katkestajad(double[] stoppernaidud) {
        int katkestajad = 0;
        for (double element : stoppernaidud) {
            if (element == 0.0) {
                katkestajad++;
            }
        }
        return katkestajad;
    }

    private static int voitjaTulemuseIndeks(double[] distantsiLabimisajad) {
        int indeks = 0;
        double vaikseimLiige = distantsiLabimisajad[0];
        for (int i = 0; i < distantsiLabimisajad.length; i++) {

            if (distantsiLabimisajad[i] < vaikseimLiige && distantsiLabimisajad[i] != 0.0) {
                vaikseimLiige = distantsiLabimisajad[i];
                indeks = i;
            }
        }
        return indeks;
    }

    private static double[] distantsiLabimisajad(double[] distantsiLabimisajad,int[] stardiaeg, double[] stoppernaidud) {
        for (int i = 0; i < stardiaeg.length; i++) {
            if (!(stoppernaidud[i] == 0)) {
                distantsiLabimisajad[i] = stoppernaidud[i] - stardiaeg[i];
            } else {
                distantsiLabimisajad[i] = 0;
            }

        }
        return distantsiLabimisajad;
    }

    private static int[] stardiaeg(int[] stardinumbrid) {
        int[] stardiaeg = new int[stardinumbrid.length];
        for (int i = 0; i < stardinumbrid.length; i++) {
            stardiaeg[i] = (stardinumbrid[i] - 1) * 15;
        }
        return stardiaeg;
    }
}
