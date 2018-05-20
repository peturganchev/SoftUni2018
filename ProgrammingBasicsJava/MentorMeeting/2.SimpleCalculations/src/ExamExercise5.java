import java.util.Scanner;

public class ExamExercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerAmount = Double.parseDouble(scanner.nextLine());
        double wineAmount = Double.parseDouble(scanner.nextLine());
        double rakiaAmount = Double.parseDouble(scanner.nextLine());
        double wiskeyAmount = Double.parseDouble(scanner.nextLine());
        double rakiaPrice = wiskeyPrice /2;
        double winePrice = rakiaPrice - rakiaPrice*0.4;
        double beerPrice = rakiaPrice - rakiaPrice*0.8;

        double totalPrice = wiskeyPrice*wiskeyAmount+wineAmount*winePrice+rakiaAmount*rakiaPrice+beerAmount*beerPrice;
        System.out.printf("%.2f",totalPrice);
    }
}
