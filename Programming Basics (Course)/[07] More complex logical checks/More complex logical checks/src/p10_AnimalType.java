import java.util.Scanner;

public class p10_AnimalType {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String animal = console.nextLine();

        String type = "";

        switch (animal) {
            case "dog":
                type = "mammal";
                break;

            case "crocodile":
            case "tortoise":
            case "snake":
                type = "reptile";
                break;

            default:
                type = "unknown";
                break;
        }

        System.out.println(type);
    }
}