import java.util.Scanner;

public class p01_PersonalTitles {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double age = Double.parseDouble(console.nextLine());
        String gender = console.nextLine();

        if("m".equals(gender) && age < 16) {
            System.out.println("Master");
        } else if ("m".equals(gender) && age >= 16) {
            System.out.println("Mr.");
        } else if ("f".equals(gender) && age < 16) {
            System.out.println("Miss");
        } else if("f".equals(gender) && age >= 16) {
            System.out.println("Ms.");
        }
    }
}