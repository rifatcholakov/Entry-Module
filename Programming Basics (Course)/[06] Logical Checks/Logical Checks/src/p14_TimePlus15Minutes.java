import java.util.Scanner;

public class p14_TimePlus15Minutes {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());

        minutes += 15;

        if(minutes >= 60) {
            hours++;
            if(hours > 23) {
                hours = 0;
            }

            minutes -= 60;
        }

        if(minutes / 10 == 0) {
            System.out.println(hours + ":0" + minutes);
        } else {
            System.out.println(hours + ":" + minutes);
        }
    }
}