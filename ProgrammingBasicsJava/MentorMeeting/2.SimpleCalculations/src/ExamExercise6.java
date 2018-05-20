import java.util.Scanner;

public class ExamExercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restTime = Integer.parseInt(scanner.nextLine());
        double cardsPrice = Double.parseDouble(scanner.nextLine());
        double adventurePrice = Double.parseDouble(scanner.nextLine());
        double coffePrice = Double.parseDouble(scanner.nextLine());
        int timeLeft = restTime - 15;
        double moneySpend = coffePrice + 3*cardsPrice + 2*adventurePrice;
        System.out.printf("%.2f%n",moneySpend);
        System.out.println(timeLeft);
    }
}
