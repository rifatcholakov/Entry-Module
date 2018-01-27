import java.util.Scanner;

public class p03_SquareOfStars {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}