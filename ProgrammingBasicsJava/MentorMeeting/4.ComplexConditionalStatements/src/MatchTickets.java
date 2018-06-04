import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double tickedPrice = category.equals("VIP") ? 499.99 : 249.99;
        double moneyLeft = budget;
        if (numberOfPeople < 5)
        {
            moneyLeft -= budget * 0.75;
        }
        else if (numberOfPeople >= 5 && numberOfPeople < 10)
        {
            moneyLeft -= budget * 0.60;
        }
        else if (numberOfPeople >= 10 && numberOfPeople < 25)
        {
            moneyLeft -= budget * 0.50;
        }
        else if (numberOfPeople >= 25 && numberOfPeople < 50)
        {
            moneyLeft -= budget * 0.40;
        }
        else
        {
            moneyLeft -= budget * 0.25;
        }
        double ticketsExpenses = numberOfPeople * tickedPrice;
        if (ticketsExpenses > moneyLeft){
            System.out.printf("Not enough money! You need %.2f leva.", ticketsExpenses - moneyLeft);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft - ticketsExpenses);
        }
    }
}
