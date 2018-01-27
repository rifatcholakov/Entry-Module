import java.util.Scanner;

public class p08_OddEvenSum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(console.nextLine());

            if(i % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        if(evenSum == oddSum) {
            System.out.println("Yes Sum = " + evenSum);
        } else {
            System.out.println("No Diff = " + Math.abs(evenSum - oddSum));
        }
    }
}