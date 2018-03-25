import java.util.Scanner;

public class p04_FootballLeague {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(console.nextLine());
        int fensNumber = Integer.parseInt(console.nextLine());

        int aSector = 0;
        int bSector = 0;
        int vSector = 0;
        int gSector = 0;

        for (int i = 0; i < fensNumber; i++) {
            String currentFenSector = console.nextLine();

            switch (currentFenSector) {
                case "A":
                    aSector++;
                    break;

                case "B":
                    bSector++;
                    break;

                case "V":
                    vSector++;
                    break;

                case "G":
                    gSector++;
                    break;
            }
        }

        char percentSymbol = '%';

        System.out.printf("%.2f%c\n", (double) aSector / fensNumber * 100, percentSymbol);
        System.out.printf("%.2f%c\n", (double) bSector / fensNumber * 100, percentSymbol);
        System.out.printf("%.2f%c\n", (double) vSector / fensNumber * 100, percentSymbol);
        System.out.printf("%.2f%c\n", (double) gSector / fensNumber * 100, percentSymbol);

        System.out.printf("%.2f%c\n", (double) fensNumber / stadiumCapacity * 100, percentSymbol);
    }
}