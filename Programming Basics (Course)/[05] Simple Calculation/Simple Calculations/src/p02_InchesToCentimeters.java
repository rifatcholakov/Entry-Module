import java.util.Scanner;

public class p02_InchesToCentimeters {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double inches = console.nextDouble();
        double centimeters = inches * 2.54;

        System.out.println(centimeters);
    }
}