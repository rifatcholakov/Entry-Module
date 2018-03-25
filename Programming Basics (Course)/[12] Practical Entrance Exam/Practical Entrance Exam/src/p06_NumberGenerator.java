import java.util.Scanner;

public class p06_NumberGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int M = Integer.parseInt(console.nextLine());
        int N = Integer.parseInt(console.nextLine());
        int L = Integer.parseInt(console.nextLine());
        int specialNumber = Integer.parseInt(console.nextLine());
        int controlNumber = Integer.parseInt(console.nextLine());

        for (int i = M; i >= 1; i--) {
            for (int j = N; j >= 1; j--) {
                for (int k = L; k >= 1; k--) {

                    int number = i * 100 + j * 10 + k;

                    if (number % 3 == 0) {
                        specialNumber += 5;
                    } else if (number % 5 == 0) {
                        specialNumber -= 2;
                    } else if (number % 2 == 0) {
                        specialNumber *= 2;
                    }

                    if (specialNumber >= controlNumber) {
                        System.out.println("Yes! Control number was reached! Current special number is " + specialNumber + ".");

                        return;
                    }
                }
            }
        }

        System.out.println("No! " + specialNumber + " is the last reached special number.");
    }
}
