import java.util.Scanner;

public class ExamExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTables = Integer.parseInt(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double areaOfPokrivki = numberOfTables * (l + 2 * 0.30) * (w + 2 * 0.30);
        double areaOfKareta = numberOfTables * (l /2 ) * (l / 2);
        double costUSD = areaOfPokrivki * 7 + areaOfKareta * 9;
        double costBGN = costUSD * 1.85;
        System.out.println(String.format("%.2f USD%n", costUSD));
        System.out.println(String.format("%.2f BGN", costBGN));
    }
}
