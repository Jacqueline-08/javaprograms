import java.util.Scanner;

public class W01_P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
// Check if the number is even or odd
        if (number < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Positive");
        }
in.close();
    }
}