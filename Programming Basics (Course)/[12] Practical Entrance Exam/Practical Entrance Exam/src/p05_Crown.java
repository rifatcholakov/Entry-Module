import java.util.Scanner;

public class p05_Crown {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        printCrownTop(n);
        printCrownMiddlePart1(n);
        printCrownMiddlePart2(n);
        printCrownBottom(n);
    }

    private static void printCrownMiddlePart2(int n) {
        int middleStarsCount = 1;
        int spacesCount = (((2 * n) -1) - 9) / 2;
        int cyclesNumber = ((n / 2) + 4) - 4;

        for (int i = 0, dotCount = 1, middleDotsCount = 1; i < cyclesNumber; i++, dotCount++) {
            if(spacesCount < 0) {
                middleStarsCount = 0;
            }

            if(i + 1 == cyclesNumber) {
                middleStarsCount = (middleDotsCount - 5) / 2;
                middleDotsCount = 1;
            }

            System.out.print(repeat('*', 1));
            System.out.print(repeat('.', dotCount));
            System.out.print(repeat('*', 1));

            System.out.print(repeat(' ', spacesCount));

            System.out.print(repeat('*', middleStarsCount));
            System.out.print(repeat('.', middleDotsCount));
            System.out.print(repeat('*', middleStarsCount));

            System.out.print(repeat(' ', spacesCount));

            System.out.print(repeat('*', 1));
            System.out.print(repeat('.', dotCount));
            System.out.print(repeat('*', 1));

            System.out.print("\n");

            spacesCount -= 2;
            middleDotsCount += 2;
        }
    }

    private static void printCrownMiddlePart1(int n) {
        int spacesCount = (((2 * n) - 1) - 5) / 2;

        System.out.print(repeat('*', 1));
        System.out.print(repeat('*', 1));

        System.out.print(repeat(' ', spacesCount));

        System.out.print(repeat('*', 1));

        System.out.print(repeat(' ', spacesCount));

        System.out.print(repeat('*', 1));
        System.out.print(repeat('*', 1));

        System.out.print("\n");
    }

    private static void printCrownBottom(int n) {
        for (int i = 0; i < 2; i++) {
            System.out.println(repeat('*', (2 * n) - 1));
        }
    }

    private static void printCrownTop(int n) {
        System.out.print('@');
        for (int i = 0; i < n - 2; i++) {
            System.out.print(' ');
        }
        System.out.print('@');
        for (int i = 0; i < n - 2; i++) {
            System.out.print(' ');
        }
        System.out.print('@' + "\n");
    }

    private static String repeat(char character, int count) {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += character;
        }

        return result;
    }
}