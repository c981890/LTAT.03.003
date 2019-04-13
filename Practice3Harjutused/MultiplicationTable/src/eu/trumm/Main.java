package eu.trumm;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiplicationTable(10, 10));
    }

    static String multiplicationTable(int width, int height) {
        int cellWidth = String.valueOf(width * height).length() + 1;

        String firstLine = String.format("%" + cellWidth + "s |", "*");

        for (int l = 1; l <= width; l++) {
            firstLine += String.format("%" + cellWidth + "s", l);
        }

        int k = 1;
        String lineStart = "";
        String formattedString = "";
        String wholeLine = "";

        for (int j = 1; j <= height; j++) {

            String line = "";
            for (int i = 1; i <= width; i++) {
                line += String.format("%" + cellWidth + "s", i * k);
            }
            // lineStartTemp += "" + k + " |" + line + "\n";
            lineStart = String.format("%" + cellWidth + "s |", k);
            formattedString = line + "\n";
            wholeLine += lineStart + formattedString;
            k++;
        }


        return firstLine + "\n" + wholeLine;
    }

}
