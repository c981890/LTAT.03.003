package eu.trumm;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiplicationTable(4, 4));
    }

    static String multiplicationTable(int width, int height) {
        int cellWidth = String.valueOf(width * height).length() + 1;
        StringBuilder firstLine = new StringBuilder(String.format("%" + cellWidth + "s |", "*"));

        for (int l = 1; l <= width; l++) {
            firstLine.append(String.format("%" + cellWidth + "s", l));
        }

        String lineStart = "";
        String nextInLine = "";
        StringBuilder wholeLine = new StringBuilder();

        for (int j = 1; j <= height; j++) {

            StringBuilder numbersInLine = new StringBuilder();
            for (int i = 1; i <= width; i++) {
                numbersInLine.append(String.format("%" + cellWidth + "s", i * j));
            }
            lineStart = String.format("%" + cellWidth + "s |", j);
            nextInLine = numbersInLine + "\n";
            wholeLine.append(lineStart).append(nextInLine);
        }
        return firstLine + "\n" + wholeLine;
    }
}
