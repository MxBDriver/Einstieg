import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int distance = read.nextInt();
       //complete the code
        int kilometers = distance / 1000;
        int meters = distance % 1000;
        System.out.println(kilometers);
        System.out.println(meters);

        read.close();
    }
}
