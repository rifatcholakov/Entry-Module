import java.util.Scanner;

public class p07_SumSeconds {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int firstPlayerTiming = Integer.parseInt(console.nextLine());
        int secondPlayerTiming = Integer.parseInt(console.nextLine());
        int thirdPlayerTiming = Integer.parseInt(console.nextLine());

        int resultInSecounds = firstPlayerTiming + secondPlayerTiming + thirdPlayerTiming;

        int seconds = resultInSecounds % 60;
        int minutes = resultInSecounds / 60;

        if(seconds / 10 == 0) {
            System.out.println(minutes + ":" + "0" + seconds);
        } else {
            System.out.println(minutes + ":" + seconds);
        }
    }
}