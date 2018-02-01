import java.util.Scanner;

public class p11_EnterEvenNumber {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter even number: ");

                int n = Integer.parseInt(console.nextLine());

                if (n % 2 == 0) {
                    System.out.println("Even number entered: " + n);
                    break;
                }

                System.out.println("The number is not even.");
            } catch (Exception e) {
                System.out.println("Invalid number!");
            }
        }
    }
}