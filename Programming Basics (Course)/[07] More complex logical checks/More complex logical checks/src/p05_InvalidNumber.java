import java.util.Scanner;

public class p05_InvalidNumber {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        if(!(number >= 100 && number <= 200 || number == 0)) {
            System.out.println("invalid");
        }
    }
}