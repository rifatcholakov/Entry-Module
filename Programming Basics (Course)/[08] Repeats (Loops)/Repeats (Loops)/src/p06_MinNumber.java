import java.util.Scanner;

public class p06_MinNumber {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(console.nextLine());

            if(number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println(minNumber);
    }
}