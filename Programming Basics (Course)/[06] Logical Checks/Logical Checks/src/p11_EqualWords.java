import java.util.Scanner;

public class p11_EqualWords {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String firstWord = (console.nextLine()).toLowerCase();
        String secondWord = (console.nextLine()).toLowerCase();

        if(firstWord.equals(secondWord)) {
            System.out.println("yes");
        } else  {
            System.out.println("no");
        }
    }
}