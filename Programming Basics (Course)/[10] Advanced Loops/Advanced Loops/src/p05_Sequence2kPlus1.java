import java.util.Scanner;

public class p05_Sequence2kPlus1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int num = 1;

        while (num <= n) {
            System.out.println(num);
            num = num * 2 + 1;
        }
    }
}