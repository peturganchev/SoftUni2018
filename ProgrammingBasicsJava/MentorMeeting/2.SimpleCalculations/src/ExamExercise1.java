import java.util.Scanner;

public class ExamExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());
        double volume = l * m * h * 0.001;
        volume = volume - volume*(percentage/100);
        System.out.printf("%.3f",volume);
    }
}
