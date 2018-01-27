import java.util.Scanner;

public class p06_RhombusOfStars {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        int stars = 1;
        int spaces = number - stars;

        //Beginning of the Rhombus
        for (int i = 1; i < number ; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            System.out.println();
            stars++;
            spaces--;
        }

        //Middle of the Rhombus
        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }

        //End of the Rhombus

        stars--;
        spaces++;

        System.out.println();

        for (int i = 1; i < number ; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            System.out.println();
            stars--;
            spaces++;
        }
    }
}