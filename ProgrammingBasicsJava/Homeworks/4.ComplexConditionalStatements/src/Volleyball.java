import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isLeap = scanner.nextLine();
        double yearHolidays = Double.parseDouble(scanner.nextLine());;
        double yearWeekends = Double.parseDouble(scanner.nextLine());;

        double saturdayPlays = (48 - yearWeekends) * 3 / 4;
        double holidayPlays = yearHolidays * 2 / 3;
        double totalPlays = saturdayPlays + holidayPlays + yearWeekends;

        if (isLeap.equals("leap")) {
            totalPlays += totalPlays * 0.15;
        }
        System.out.println(Math.floor(totalPlays));
    }
}
