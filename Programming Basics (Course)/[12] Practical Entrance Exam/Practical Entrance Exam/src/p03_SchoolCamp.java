import java.util.Scanner;

public class p03_SchoolCamp {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String season = console.nextLine();
        String groupType = console.nextLine();
        int studentsCount = Integer.parseInt(console.nextLine());
        int nightsCount = Integer.parseInt(console.nextLine());

        double pricePerNight = 0;

        String sport = "";

        switch (season) {
            case "Spring":
                if(groupType.equals("mixed")) {
                    pricePerNight = 9.5;
                } else {
                    pricePerNight = 7.2;
                }

                switch (groupType) {
                    case "boys":
                        sport = "Tennis";
                        break;

                    case "girls":
                        sport =  "Athletics";
                        break;

                    case "mixed":
                        sport = "Cycling";
                        break;
                }

                break;

            case "Summer":
                if(groupType.equals("mixed")) {
                    pricePerNight = 20;
                } else {
                    pricePerNight = 15;
                }

                switch (groupType) {
                    case "boys":
                        sport = "Football";
                        break;

                    case "girls":
                        sport = "Volleyball";
                        break;

                    case "mixed":
                        sport = "Swimming";
                        break;
                }

                break;

            case "Winter":
                if(groupType.equals("mixed")) {
                    pricePerNight = 10;
                } else {
                    pricePerNight = 9.6;
                }

                switch (groupType) {
                    case "boys":
                        sport = "Judo";
                        break;

                    case "girls":
                        sport = "Gymnastics";
                        break;

                    case "mixed":
                        sport = "Ski";
                        break;
                }

                break;
        }

        double discount = 0;

        if(studentsCount >= 50) {
            discount = 0.5;
        } else if (studentsCount >= 20) {
            discount = 0.15;
        } else if(studentsCount >= 10) {
            discount = 0.05;
        }

        double totalPrice = pricePerNight * studentsCount * nightsCount;
        totalPrice -= (totalPrice * discount);

        System.out.printf("%s %.2f lv.", sport, totalPrice);
    }
}