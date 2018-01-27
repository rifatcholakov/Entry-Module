import java.util.Scanner;

public class p11_Cinema {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String projectionType = console.nextLine();
        int rows = Integer.parseInt(console.nextLine());
        int columns = Integer.parseInt(console.nextLine());

        double price = 0;

        switch (projectionType) {
            case "Premiere":
                price = 12.0;
                break;

            case "Normal":
                price = 7.5;
                break;

            case "Discount":
                price = 5.0;
                break;
        }

        double income = price * rows * columns;

        System.out.printf("%.2f leva", income);
    }
}