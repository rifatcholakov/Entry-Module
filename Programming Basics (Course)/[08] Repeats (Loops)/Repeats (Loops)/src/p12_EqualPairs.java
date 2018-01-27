import java.util.Scanner;

public class p12_EqualPairs {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int sum = 0;
        int maxDifference = 0;

        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(console.nextLine());
            int num2 = Integer.parseInt(console.nextLine());

            int currentPairSum = num1 + num2;

            if(i != 0) {
                int currentDifference = Math.abs(sum - currentPairSum);

                if(currentDifference > maxDifference) {
                    maxDifference = currentDifference;
                }
            }

            sum = num1 + num2;
        }

        if(maxDifference == 0) {
            System.out.println("Yes, value=" + sum);
        } else {
            System.out.println("No, maxdiff=" + maxDifference);
        }
    }
}