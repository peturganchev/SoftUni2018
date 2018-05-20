import java.util.Scanner;

public class ExamExercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int chefs = Integer.parseInt(scanner.nextLine());
        int cakesPerChef = Integer.parseInt(scanner.nextLine());
        int wafflePerChef = Integer.parseInt(scanner.nextLine());
        int pancakesPefChef = Integer.parseInt(scanner.nextLine());

        double cakePrice = 45;
        double wafflePrice = 5.80;
        double pancakesPrice = 3.20;

        double sumOfCash = days*chefs*((cakesPerChef*cakePrice)+(wafflePerChef*wafflePrice)+(pancakesPefChef*pancakesPrice));
        double raisedMoney = sumOfCash-sumOfCash/8;

        System.out.printf("%.2f",raisedMoney);
    }
}
