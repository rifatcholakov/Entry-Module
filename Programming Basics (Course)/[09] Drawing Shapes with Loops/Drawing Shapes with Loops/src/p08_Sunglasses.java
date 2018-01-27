import java.util.Scanner;

public class p08_Sunglasses {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        //Sunglasses top
        for (int i = 0; i < number * 2; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < number * 2; i++) {
            System.out.print("*");
        }

        //Sunglasses middle
        System.out.println();

        for (int i = 1; i <= number - 2; i++) {

            //First row
            System.out.print("*");
            for (int j = 0; j < number * 2 - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");

            //Middle row
            if(i == (number - 1) / 2) {
                for (int j = 0; j < number; j++) {
                    System.out.print("|");
                }
            } else {
                for (int j = 0; j < number; j++) {
                    System.out.print(" ");
                }
            }

            //Last row
            System.out.print("*");
            for (int j = 0; j < number * 2 - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");

            System.out.println();
        }

        //Sunglasses Bottom
        for (int i = 0; i < number * 2; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < number * 2; i++) {
            System.out.print("*");
        }
    }
}