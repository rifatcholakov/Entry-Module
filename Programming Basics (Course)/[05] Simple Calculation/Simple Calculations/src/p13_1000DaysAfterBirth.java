import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p13_1000DaysAfterBirth {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ( "dd-MM-yyyy" );
        LocalDate localDate = LocalDate.parse(input , formatter);
        localDate = localDate.plusDays(999);

        String formattedString = localDate.format(formatter);

        System.out.println(formattedString);
    }
}