import java.util.Scanner;

public class Conditional_statements {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean isSuspended = read.nextBoolean();
        int ourScore = read.nextInt();
        int theirScore = read.nextInt();

        // your code goes here
        if (isSuspended == true) {
            System.out.println("Suspended");
        } else {
            if (ourScore > theirScore) {
                System.out.println("Won");
            } if (ourScore < theirScore) {
                System.out.println("Lost");
            } else {
                System.out.println("Draw");
            }
        }
        read.close();
    }
}
