import java.util.Scanner;

public class p04_Hospital {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int period = Integer.parseInt(console.nextLine());

        int treatedPatients = 0;
        int untreatedPatients = 0;
        int countOfDoctors = 7;

        for (int day = 1; day <= period; day++) {
            int currentPatients = Integer.parseInt(console.nextLine());

            if ((day % 3 == 0) && (untreatedPatients > treatedPatients)) {
                countOfDoctors++;
            }

            if (currentPatients > countOfDoctors) {
                treatedPatients += countOfDoctors;
                untreatedPatients += currentPatients - countOfDoctors;
            } else {
                treatedPatients += currentPatients;
            }
        }

        System.out.printf("Treated patients: %d.\n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}