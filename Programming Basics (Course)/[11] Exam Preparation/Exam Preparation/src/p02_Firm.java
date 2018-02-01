import java.util.Scanner;

public class p02_Firm {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int neededHours = Integer.parseInt(console.nextLine());
        int days = Integer.parseInt(console.nextLine());
        int overtimeWorkers = Integer.parseInt(console.nextLine());

        double daysToWork = days - (days * 0.1);
        double workingTime = daysToWork * 8;
        double overTimeWork = overtimeWorkers * 2 * days;

        double totalWorkingTime = Math.floor(workingTime + overTimeWork);

        int remainingTime = (int) Math.abs(totalWorkingTime - neededHours);

        if (totalWorkingTime >= neededHours) {
            System.out.printf("Yes!%d hours left.", remainingTime);
        } else {
            System.out.printf("Not enough time!%d hours needed.", remainingTime);
        }
    }
}