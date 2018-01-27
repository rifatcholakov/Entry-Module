import java.util.Scanner;

public class p10_HalfSumElement {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int sum = 0;

        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(console.nextLine());

            sum += number;

            if(number > maxNumber) {
                maxNumber = number;
            }
        }

        sum -= maxNumber;

        if(sum == maxNumber) {
            System.out.println("Yes Sum = " + sum);
        } else {
            System.out.println("No Diff = " + Math.abs(sum - maxNumber));
        }
    }
}