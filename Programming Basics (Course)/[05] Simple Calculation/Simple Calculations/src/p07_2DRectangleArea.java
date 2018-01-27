import java.util.Scanner;

public class p07_2DRectangleArea {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double a = Math.abs(x1 - x2);
        double b = Math.abs(y2 - y1);

        System.out.println(a * b);
        System.out.println(2 * (a + b));
    }
}