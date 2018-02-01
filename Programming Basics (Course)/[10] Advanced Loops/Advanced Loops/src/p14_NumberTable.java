import java.util.Scanner;

public class p14_NumberTable {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int row = 1; row <= n; row++) {
            int left = row;
            int right = n - 1;

            for (int col = 1; col <= n; col++) {
                if (left <= n) {
                    System.out.printf("%d ", left);
                    left++;
                } else {
                    System.out.printf("%d ", right);
                    right--;
                }
            }

            System.out.println();
        }
    }
}