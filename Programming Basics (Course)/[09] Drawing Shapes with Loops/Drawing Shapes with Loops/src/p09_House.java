import java.util.Scanner;

public class p09_House {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        int stars = 0;
        int isOdd = 0;

        if(number % 2 == 0) {
            stars = 2;
        } else {
            stars = 1;
            isOdd = 1;
        }

        // House roof
        for (int i = 0; i < number / 2 + isOdd; i++) {
            for (int j = 0; j < (number - stars) / 2; j++) {
                System.out.print("-");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < (number - stars) / 2; j++) {
                System.out.print("-");
            }

            stars += 2;

            System.out.println();
        }

        // The rest of the house
        for (int i = 0; i < number / 2; i++) {
            System.out.print("|");
            for (int j = 0; j < number - 2; j++) {
                System.out.print("*");
            }
            System.out.print("|");

            System.out.println();
        }
    }
}