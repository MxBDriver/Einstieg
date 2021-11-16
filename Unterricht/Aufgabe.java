//import java.util.Scanner;

public class Aufgabe {
    public static void main(String[] args) {

        int[][] zeiten = { { 2, 8, 10 }, { 2, 17, 20 }, { 3, 7, 50 }, { 6, 8, 0 }, { 6, 16, 0 }, { 7, 16, 30 },
                { 8, 8, 20 }, { 8, 16, 40 }, { 30, 8, 10 } };
        int personalnummer = 123;
        int monat = 06;
        int jahr = 2010;
        // System.out.println(personalnummer, zeiten, monat, jahr);
        // Variablen initialisieren
        int tag = 1;
        int anwTag = 0;
        int zeilen = 0;
        int anwMonat = 0;

        // funktionen initialisieren

        // Algorithmus / Codeblock
        System.out.println("Personal Nr: " + Integer.toString(personalnummer) + " " + "Jahr: " + Integer.toString(jahr)
                + " " + "Monat: " + Integer.toString(monat));
        for (zeilen = 0; zeilen < zeiten.length;) {
            anwTag = 0;
            // keine buchung
            if (tag < zeiten[zeilen][0]) {
                // DANN
                System.out.println(tag + Integer.toString(-1) + "-1" + "-1" + "-1" + anwTag + "nicht anwesend");

            } // ENDE WENN
              // Zwei Buchungen
            else if (tag == zeiten[zeilen][0] && tag == zeiten[zeilen + 1][0]) {
                // DANN
                anwTag = zeiten[zeilen + 1][1] * 60 + zeiten[zeilen + 1][2]
                        - (zeiten[zeilen][1] * 60 + zeiten[zeilen + 1][2]);
                anwMonat = anwTag + anwMonat;
                System.out.println(tag + zeiten[zeilen][1] + zeiten[zeilen][2] + zeiten[zeilen + 1][1]
                        + zeiten[zeilen + 1][2] + anwTag);
                zeilen = zeilen + 2;

            } // ENDE ANSONSTEN WENN
              // Eine Buchung
            else if (tag == zeiten[zeilen][0] && tag != zeiten[zeilen + 1][0]) {
                // DANN
                System.out.println(tag + zeiten[zeilen][1] + zeiten[zeilen][2] + Integer.toString(-1) + "-1" + anwTag
                        + "Buchung fehlt");
                zeilen = zeilen + 1;

            } // ENDE ANSONSTEN WENN

            tag++;
        }
        System.out.println(anwTag);

    }
}
