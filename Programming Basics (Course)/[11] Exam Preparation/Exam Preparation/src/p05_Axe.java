import java.util.Scanner;

public class p05_Axe {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int width = 5 * n;
        int leftDashes = 3 * n;
        int middleDashes = 0;
        int rightDashes = width - leftDashes - middleDashes - 2;

        for (int i = 0; i < n; i++) {
            System.out.printf("%s*%s*%s\n",
                    stringRepeater("-", leftDashes),
                    stringRepeater("-", middleDashes),
                    stringRepeater("-", rightDashes)
            );

            middleDashes++;
            rightDashes--;
        }

        middleDashes--;
        rightDashes++;

        for (int i = 0; i < n / 2; i++) {
            System.out.printf("%s*%s*%s\n",
                    stringRepeater("*", leftDashes),
                    stringRepeater("-", middleDashes),
                    stringRepeater("-", rightDashes)
            );
        }

        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.printf("%s*%s*%s\n",
                    stringRepeater("-", leftDashes),
                    stringRepeater("-", middleDashes),
                    stringRepeater("-", rightDashes)
            );

            leftDashes--;
            middleDashes += 2;
            rightDashes--;
        }

        System.out.printf("%s*%s*%s\n",
                stringRepeater("-", leftDashes),
                stringRepeater("*", middleDashes),
                stringRepeater("-", rightDashes)
        );
    }

    private static String stringRepeater(String character, int number) {
        String result = "";

        for (int i = 0; i < number; i++) {
            result += character;
        }

        return result;
    }
}