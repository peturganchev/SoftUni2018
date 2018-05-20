import java.util.Scanner;

public class ExamExercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double a = Double.parseDouble(scanner.nextLine());
        double roomSize = (l*100)*(w*100);
        double sizeWardrobe = (a*100)*(a*100);
        double sizeBench = roomSize/10;
        double freeSpace = roomSize - sizeWardrobe - sizeBench;
        double numberOfDancers = freeSpace / (40 + 7000);
        System.out.println((int)numberOfDancers);
    }
}
