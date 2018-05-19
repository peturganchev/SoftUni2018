import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        String from = scanner.nextLine();
        String to = scanner.nextLine();
        switch (from){
            case "USD":
                money = money*1.79549;
                break;
            case "EUR":
                money = money*1.95583;
                break;
            case "GBP":
                money = money * 2.53405;
                break;
        }
        switch (to){
            case "USD":
                money = money/1.79549;
                break;
            case "EUR":
                money = money/1.95583;
                break;
            case "GBP":
                money = money / 2.53405;
                break;
        }
        System.out.printf("%.2f",money);
    }
}
