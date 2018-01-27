import java.util.Scanner;

public class p07_LeftAndRightSum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int firstSum = 0;
        int secondSum = 0;
        int number = 0;

        for (int i = 1; i <= n * 2; i++) {
             number += Integer.parseInt(console.nextLine());

            if(i == n) {
                firstSum = number;
                number = 0;
            } else if (i == n * 2) {
                secondSum = number;
            }
        }

        if (firstSum == secondSum) {

            System.out.println("Yes, sum = " + firstSum);
        } else {
            System.out.println("No, diff = " + Math.abs(firstSum - secondSum));
        }
    }
}