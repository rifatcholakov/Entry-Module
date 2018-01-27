import java.util.Scanner;

public class p13_AreaOfFigures {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String figureType = console.nextLine();

        if("square".equals(figureType)) {
            double a = Double.parseDouble(console.nextLine());

            double area = a * a;

            System.out.println(area);
        } else if("rectangle".equals(figureType)) {
            double a = Double.parseDouble(console.nextLine());
            double b = Double.parseDouble(console.nextLine());

            double area = a *b;

            System.out.println(area);
        } else if("circle".equals(figureType)) {
            double radius = Double.parseDouble(console.nextLine());

            double area = Math.PI * Math.pow(radius, 2);

            System.out.println(area);
        } else if("triangle".equals(figureType)) {
            double a = Double.parseDouble(console.nextLine());
            double h = Double.parseDouble(console.nextLine());

            double area = (a * h) / 2;

            System.out.println(area);
        }
    }
}