import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    
    Scanner eingabewert = new Scanner(System.in);
    String string1 = eingabewert.nextLine();
    int zahl1 = eingabewert.nextInt();
    System.out.println("Text: "+string1);
    System.out.println("Zahl: "+zahl1);

    eingabewert.close();
    }

}
