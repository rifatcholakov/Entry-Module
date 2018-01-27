import java.util.Scanner;

public class P10_Diamond {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        int rows = number;
        int leftRight = (number - 1) / 2;    //1
        int middle = number - 2 * leftRight - 2; //-1
        int lines = 0;

        if (number % 2 == 0) {
            for (int i = 0; i < (number / 2); i++) {
                System.out.println(repeatStr("-", ((number - 2) / 2) - i) + "*" + repeatStr("-", 2 * i) + "*" + repeatStr("-", ((number - 2) / 2) - i));
            }

            for (int i = (number / 2) - 2; i >= 0; i--) {
                System.out.println(repeatStr("-", ((number - 2) / 2) - i) + "*" + repeatStr("-", 2 * i) + "*" + repeatStr("-", ((number - 2) / 2) - i));
            }
        } else {
            for (int i = 0; i < (number / 2); i++) {
                if (i == 0) {
                    System.out.println(repeatStr("-", ((number - 1) / 2) - i) + "*" + repeatStr("-", ((number - 1) / 2) - i));
                } else {
                    System.out.println(repeatStr("-", ((number - 1) / 2) - i) + "*" + repeatStr("-", 2 * i - 1) + "*" + repeatStr("-", ((number - 1) / 2) - i));
                }
            }

            if (number == 1) {
                System.out.println("*");
            }
            if (number > 1) {
                System.out.println("*" + repeatStr("-", number - 2) + "*");
            }

            for (int i = (number / 2) - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.println(repeatStr("-", ((number - 1) / 2) - i) + "*" + repeatStr("-", ((number - 1) / 2) - i));
                } else {
                    System.out.println(repeatStr("-", ((number - 1) / 2) - i) + "*" + repeatStr("-", 2 * i - 1) + "*" + repeatStr("-", ((number - 1) / 2) - i));
                }
            }
        }
    }

    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}