import java.util.Scanner;

public class p12_Volleyball {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String yearType = console.nextLine();
        int holidays = Integer.parseInt(console.nextLine());
        int gamesAtHometown = Integer.parseInt(console.nextLine());

        double saturdayGames = (48.0 - gamesAtHometown) * (3 / 4.0);
        double gamesAtHolidays = holidays * (2 / 3.0);

        double totalGames = saturdayGames + gamesAtHometown + gamesAtHolidays;

        if ("leap".equals(yearType)) {
            totalGames = totalGames + (0.15 * totalGames);
        }

        System.out.println((int) totalGames);
    }
}