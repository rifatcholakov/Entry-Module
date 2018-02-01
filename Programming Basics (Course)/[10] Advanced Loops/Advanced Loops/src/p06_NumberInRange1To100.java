import java.util.Scanner;

public class p06_NumberInRange1To100 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        while (n < 1 || n > 100)
        {
            System.out.println("Invalid number!");

            n = Integer.parseInt(console.nextLine());
        }

        System.out.println("\"The number is: " + n);
    }
}