public class Test {
    public static void main(String[] args) {
        // int i = 25;
        Mensch klaus = new Mensch("Hans", 'm', "Lehmann", 1.78, "16 inch");

        System.out.println(klaus.groesse);
        System.out.println(klaus.haarfarbe);


        // Weisen Sie Vorname, Nachname, Gewicht und Haarfarbe mit neuen Werten zu
        klaus.vorname = "klaus";
        klaus.nachname = "Hanz";
        klaus.groesse = 1.60;
        klaus.haarfarbe = "brown";
        klaus.setGeschlecht('d');

        System.out.println(klaus.vorname);
        System.out.println(klaus.nachname);
        System.out.println(klaus.groesse);
        System.out.println(klaus.haarfarbe);
        System.out.println(klaus.getGeschlecht());
        klaus.setGeschlecht("männlich");

        // Warum geht das bei Geschlecht nicht
        // Da es auf private gesetzt wurde

        // Hannelore Müller, weiblich, blond, 1,70m groß
        Mensch hannelore = new Mensch("Hannelore", 'w', "Müller", 1.70, "blond");
        
        System.out.println(hannelore.nachname);
        // System.out.println(hannelore.vorname);
        // System.out.println(hannelore.nachname);
        // System.out.println(hannelore.groesse);
        // System.out.println(hannelore.haarfarbe);
        // System.out.println(hannelore.getGeschlecht());

        hannelore.heirat(klaus);
        System.out.println(hannelore.nachname);
    }

}
