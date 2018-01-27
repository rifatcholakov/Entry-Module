import java.util.Scanner;

public class p13_PointInTheFigure {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double h = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());

        if ((x > h) && (x < 2 * h) && (y == h)) {
            System.out.println("inside");
        } else if ((x >= h) && (x <= 2 * h) && (y >= h) && (y <= 4 * h)) {

            if ((x > h) && (x < 2 * h) && (y > h) && (y < 4 * h)) {
                System.out.println("inside");
            } else if ((x >= h) && (x <= 2 * h) || (y >= h) && (y <= 4 * h)) {
                System.out.println("border");
            }

        } else if ((x >= 0) && (x <= 3 * h) && (y >= 0) && (y <= h)) {

            if ((x > 0) && (x < 3 * h) && (y > 0) && (y < h)) {
                System.out.println("inside");
            } else if ((x >= 0) && (x <= 3 * h) || (y >= 0) && (y <= h)) {
                System.out.println("border");
            }

        } else {
            System.out.println("outside");
        }
    }
}