/**
 * Mensch
 */
public class Mensch {
    public String vorname;
    private char geschlecht;
    public String nachname;
    public double groesse;
    public String haarfarbe;

    //Konstrukror
    Mensch(String vorname, char geschlecht, String nachname, double groesse, String haarfarbe) {

    this.vorname = vorname;
    this.geschlecht = geschlecht;
    this.nachname = nachname;
    this.groesse = groesse;
    this.haarfarbe = haarfarbe;
    }

    public void setGeschlecht(char geschlecht) {
        if ((geschlecht=='m') || (geschlecht=='w') || (geschlecht=='d')){
            this.geschlecht = geschlecht;
        }
    }
    public char getGeschlecht(){
        return this.geschlecht;
    }

    public void heirat(Mensch partner) {
        // 20. Jahrhundert
        if ((this.geschlecht == partner.geschlecht) || (this.geschlecht == 'd') || (partner.geschlecht == 'd')) {
            System.out.println("Schweinskram...");
            return;
        }
        if (this.geschlecht=='w') {
            this.nachname = partner.nachname;
        } else {
            partner.nachname = this.nachname;
        }
    }

    // Überladen der Funktion
    public void setGeschlecht(String geschlecht) {
        if ((geschlecht=="männlich")){
            this.geschlecht = 'm';
        } else if ((geschlecht=="weiblich")){
            this.geschlecht = 'w';
        }else {
            this.geschlecht = 'd';
        }
    }
}
