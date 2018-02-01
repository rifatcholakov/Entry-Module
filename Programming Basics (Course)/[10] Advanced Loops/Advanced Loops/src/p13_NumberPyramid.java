import java.util.Scanner;

public class p13_NumberPyramid {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int counter = 1;
        int num = 1;

        while (num <= n) {
            for (int j = 0; j < counter; j++) {
                System.out.printf("%d ", num);

                num++;

                if (num > n) {
                    return;
                }
            }
            counter++;

            System.out.println();
        }
    }
}