import java.util.Scanner;

public class p04_TriangleOfDollars {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("$ ");
            }

            System.out.println();
        }
    }
}