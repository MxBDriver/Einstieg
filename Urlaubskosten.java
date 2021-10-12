/* Entwickeln SIe ein Programm, dass bei der PLanmnung einer Urlaubsreise hilft. 
        *Das Programm fragt folgende Infos ab
        anzahl erwachsener
        Anazhl kinder 
        feste werte:
        preis pro person = 50EUro
        preis pro kind = 10Euro
        buskosten = 280Euro
        
        Anschliesend berechnet das Programm die Gesamtkosten*/
import java.util.Scanner;

public class Urlaubskosten {
    public static void main(String[] args) {
        
    int preis_p_erw = 50, preis_p_kind = 10, buskosten = 280;
    

    Scanner eingabe = new Scanner(System.in);
    System.out.print("Wie viele Erwachsene möchten reisen? ");
    int erw = eingabe.nextInt();
    System.out.print("Wie viele Kinder kommen mit? ");
    int kind = eingabe.nextInt();

    System.out.println("Kosten pro Erwachsener: "+ erw *preis_p_erw + "€");
    System.out.println("Kosten pro Kind: "+ kind *preis_p_kind + "€");
    int gesamtkosten = (kind*preis_p_kind + erw*preis_p_erw + buskosten);
    System.out.println("Gesamtkosten: "+ gesamtkosten + "€");

    eingabe.close();
    }
}
