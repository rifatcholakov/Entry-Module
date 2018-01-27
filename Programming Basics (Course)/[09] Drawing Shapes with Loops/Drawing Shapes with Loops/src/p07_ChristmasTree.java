import java.util.Scanner;

public class p07_ChristmasTree {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        int spaces = number - 1;
        int stars = 1;

        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
        
        System.out.print(" | ");

        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

        System.out.println();

        for (int i = 1; i < number + 1; i++) {

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.print(" | ");

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            System.out.println();

            spaces--;
            stars++;
        }
    }
}